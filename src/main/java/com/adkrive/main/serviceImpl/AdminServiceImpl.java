package com.adkrive.main.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.adkrive.main.general.Argon2HashedPassword;
import com.adkrive.main.general.GeneralConstant;
import com.adkrive.main.general.Utility;
import com.adkrive.main.model.Admin;
import com.adkrive.main.model.AdvTransactionLog;
import com.adkrive.main.model.Advertise;
import com.adkrive.main.model.Advertiser;
import com.adkrive.main.model.BlockedIpLog;
import com.adkrive.main.model.AdType;
import com.adkrive.main.model.Country;
import com.adkrive.main.model.Deposit;
import com.adkrive.main.model.Domain;
import com.adkrive.main.model.GlobalSetting;
import com.adkrive.main.model.IpLog;
import com.adkrive.main.model.ManageKeyWord;
import com.adkrive.main.model.Password;
import com.adkrive.main.model.PmntGtway;
import com.adkrive.main.model.PricePlan;
import com.adkrive.main.model.Profile;
import com.adkrive.main.model.Publisher;
import com.adkrive.main.model.PublisherEarningLog;
import com.adkrive.main.model.Ticket;
import com.adkrive.main.model.UserLoginHistory;
import com.adkrive.main.model.WithDrawMethod;
import com.adkrive.main.model.WithDrawls;
import com.adkrive.main.repository.AdminRepository;
import com.adkrive.main.repository.AdvTxLogrepository;
import com.adkrive.main.repository.AdvertiseRepository;
import com.adkrive.main.repository.AdvertiserRepository;
import com.adkrive.main.repository.AidTypeRepository;
import com.adkrive.main.repository.BlockedIpRepository;
import com.adkrive.main.repository.CountryRepositiory;
import com.adkrive.main.repository.DepositRepository;
import com.adkrive.main.repository.DomainRepository;
import com.adkrive.main.repository.GlobalSettingRepository;
import com.adkrive.main.repository.IplogRepository;
import com.adkrive.main.repository.ManagekeywordRepositiory;
import com.adkrive.main.repository.PasswordRepository;
import com.adkrive.main.repository.PmntGatewayRepository;
import com.adkrive.main.repository.PricePlanRepository;
import com.adkrive.main.repository.ProfileRepository;
import com.adkrive.main.repository.PubEarnLogrepository;
import com.adkrive.main.repository.PublisherRepository;
import com.adkrive.main.repository.SupportTicketRepository;
import com.adkrive.main.repository.UserLoginHistoryRepository;
import com.adkrive.main.repository.UserLogrepository;
import com.adkrive.main.repository.WithdrawMethodRepository;
import com.adkrive.main.repository.WithdrawRepository;
import com.adkrive.main.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private PasswordRepository passwordRepository;
	@Autowired
	private PublisherRepository publisherRepository;
	@Autowired
	private CountryRepositiory countryRepositiory;
	@Autowired
	private AdvertiserRepository advertiserRepository;
	@Autowired
	private ManagekeywordRepositiory managekeywordRepositiory;
	@Autowired
	private AdvertiseRepository advertiseRepository;
	@Autowired
	private PricePlanRepository planRepository;
	@Autowired
	private IplogRepository iplogRepository;
	@Autowired
	private BlockedIpRepository blockedIpRepository;
	@Autowired
	private AidTypeRepository aidTypeRepository;
	@Autowired
	private PmntGatewayRepository gatewayRepository;
	@Autowired
	private DomainRepository domainRepository;
	@Autowired
	private DepositRepository depositRepository;
	@Autowired
	private WithdrawMethodRepository methodRepository;
	@Autowired
	private WithdrawRepository withdrawRepository;
	@Autowired
	private SupportTicketRepository ticketRepository;

	@Autowired
	private GlobalSettingRepository globalSettingRepository;
	
	@Autowired
	private PubEarnLogrepository earnLogrepository;

	@Autowired
	private AdvTxLogrepository advTxLogrepository;

	@Autowired
	private UserLogrepository logrepository;

	@Autowired
	private UserLoginHistoryRepository historyRepository;

	@Override
	public boolean matchAdminLoginDetails(String userName, String password)// for password verification
	{

		boolean status = false;
		if (userName == null || password == null) {
			return false;
		}
		Admin adminlist = adminRepository.findByUserNameAndPassword(userName);
		if (adminlist != null) {
			if (userName.equals(adminlist.getUserName().toString())
					&& Argon2HashedPassword.matches(password, adminlist.getPassword())) {
				status = true;

			} else {
				status = false;
			}
		}
		return status;

	}

	public void updateResetPasswordToken(String token, String email) throws CustomerNotFoundException {
		Admin admin = adminRepository.findByEmail(email);
		if (admin != null) {
			admin.setResetPasswordToken(token);
			adminRepository.save(admin);
		} else {
			throw new CustomerNotFoundException("Could not find any user with the email " + email);
		}
	}

	public Admin getByResetPasswordToken(String token) {
		return adminRepository.findByResetPasswordToken(token);
	}

	public void updatePassword(Admin admin, String newPassword) {

		String encodedPassword = Argon2HashedPassword.hashedPassword(newPassword);
		admin.setPassword(encodedPassword);

		admin.setResetPasswordToken(null);
		adminRepository.save(admin);
	}

//adding for profile setting
	@Override
	public Integer fetchOrUpdateProfile(MultipartFile file, String name, String email) {
		Integer counter = 0;
		long count = profileRepository.count();
		Profile profile = new Profile();
		if (count == 0) {
			profile.setName(name);
			profile.setEmail(email);
			String fileName = StringUtils.cleanPath(file.getOriginalFilename());
			if (fileName.contains("..")) {
				System.out.println("not a a valid file");
			}
			try {
				profile.setImage(file.getBytes());
				profileRepository.save(profile);
			} catch (Exception e) {

			}

		}
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if (fileName.contains("..")) {
			System.out.println("not a a valid file");
		}
		try {
			counter = profileRepository.updateProfile(name, email, file.getBytes());

			updateAdminDetails(name, email, file.getBytes());

			upDatePassWordEmail(email);

			return counter;
		} catch (Exception e) {

		}
		return counter;

	}

	@Override

	public boolean updateAdminDetails(String name, String email, byte[] image) {
		adminRepository.updateAdmin(name, email, image);
		return true;
	}

	@Override

	public boolean upDatePassWordEmail(String email) {
		passwordRepository.updatePassWord(email);
		return true;
	}

	@Override
	public Profile getImages(long id) {
		@SuppressWarnings("rawtypes")
		Optional findById = profileRepository.findById(id);
		if (findById.isPresent()) {
			Profile getImageDetails = (Profile) findById.get();
			return getImageDetails;
		} else {
			return null;
		}

	}

	@Override
	public Profile checkProfileRecord() {
		Profile pf = profileRepository.getAllDetails();
		return pf;
	}

	// for updating profile user

	public Profile updateProfileSetting(Profile profile, String name, String email, byte[] image, Date updated_at)
			throws CustomerNotFoundException {
		// Profile profile = profileRepository.findByEmail(email);

		if (profile != null) {
			profile.setName(name);
			profile.setEmail(email);
			profile.setImage(image);
			profile.setUpdated_at(updated_at);
			profile = profileRepository.save(profile);

		} else {
			throw new CustomerNotFoundException("Could not find any user with the email " + email);
		}
		return profile;
	}

	@Override
	public boolean saveNewPassword(Password pass) {

		boolean status = false;
		Password passDetails = passwordRepository.getPassWordDetails();
		Admin admin = adminRepository.getAllDetails();
		long count = adminRepository.count();
		if (count == 1 && passDetails == null) {

			pass.setEmail(admin.getEmail());
			pass.setStatus(1);
			pass.setResetPasswordToken(admin.getResetPasswordToken());
			pass.setCreated_at(null);
			pass.setUpdated_at(null);
			passwordRepository.save(pass);
			return status;
		} else {
			List<Admin> list = adminRepository.findAll();
			for (int i = 0; i < list.size(); i++) {
				if (Argon2HashedPassword.matches(pass.getPassword(), list.get(i).getPassword().toString())) {
					status = true;
					break;
				} else {
					status = false;
				}
			}

			if (status) {
				updatePassword(admin, pass.getNewPassword());
				status = true;
			} else {
				status = false;
			}
		}
		return status;
	}

	@Override
	public List<Publisher> getAllPublisher() {
		return publisherRepository.findAll();
	}

	@Override
	public List<Publisher> getAllActivePublisher() {
		return publisherRepository.getAllActivePublisher();

	}

	@Override
	public List<Publisher> getAllBannedPublisher() {

		return publisherRepository.getAllBannedPublisher();

	}

	@Override
	public List<Publisher> getAllEmailUnverifiedPublisher() {
		return publisherRepository.getAllEmailUnverifiedPublisher();

	}

	@Override
	public List<Publisher> getAllSmslUnverifiedPublisher() {

		return publisherRepository.getAllSmslUnverifiedPublisher();
	}

	public long no_of_publishers() {
		long count = publisherRepository.count();
		return count;
	}

	public long no_of_unVerifiedEmailpublishers() {
		long count = publisherRepository.count();
		return count;
	}

	public long no_of_unVerifiedSmspublishers() {
		long count = publisherRepository.count();
		return count;
	}

	@Override
	public List<Publisher> searchPublisherByNameOrEmail(String value) {
		List<Publisher> publishersList = publisherRepository.searchPublisherByNameOrEmail(value);
		return publishersList;
	}

	@Override
	public Admin getAdminDetailsByEmail(String email) {
		Admin admin = adminRepository.findByEmail(email);
		return admin;
	}

	@Override
	public Password getPassWordDetails() {
		Password passDetails = passwordRepository.getPassWordDetails();
		return passDetails;
	}

	@Override
	public Admin getAdminDetails() {
		Admin admin = adminRepository.getAllDetails();
		return admin;
	}

	@Override
	public List<Country> getListOfCountries() {
		return countryRepositiory.findAll();

	}

	@Override
	public boolean sendEmailToAllPublisher() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Advertiser> getAllAdvertiser() {

		return advertiserRepository.findAll();
	}

	@Override
	public List<Advertiser> getAllActiveAdvertiser() {

		return advertiserRepository.getAllActiveAdvertiser();
	}

	@Override
	public List<Advertiser> getAllBannedAdvertiser() {
		return advertiserRepository.getAllBannedAdvertiser();
	}

	@Override
	public List<Advertiser> getAllEmailUnverifiedAdvertiser() {
		return advertiserRepository.getAllEmailUnverifiedAdvertiser();
	}

	@Override
	public List<Advertiser> getAllSmslUnverifiedAdvertiser() {
		return advertiserRepository.getAllSmslUnverifiedAdvertiser();
	}

	@Override
	public List<Advertiser> searchAdvertiserByNameOrEmail(String value) {
		return advertiserRepository.searchAdvertiserByNameOrEmail(value);
	}

	@Override
	public Integer addKeyWords(ManageKeyWord manageKeyWord) {
		String[] str = Utility.getSplitOfListString(manageKeyWord.getKeywords());
		List<String> list = Arrays.asList(str);
		List<ManageKeyWord> addList = new ArrayList<ManageKeyWord>();
		for (int i = 0; i < list.size(); i++) {
			ManageKeyWord mkbd = new ManageKeyWord();
			mkbd.setCreated_at(new Date());
			mkbd.setUpdated_at(new Date());
			mkbd.setKeywords(list.get(i));
			addList.add(mkbd);
		}
		List<ManageKeyWord> mkwd = managekeywordRepositiory.saveAll(addList);
		if (mkwd != null) {
			return 1;
		}
		return 0;
	}

	@Override
	public List<ManageKeyWord> getAllManageKeyword() {

		return managekeywordRepositiory.findAll();
	}

	@Override
	public Optional<ManageKeyWord> updateById(Integer id) {

		return managekeywordRepositiory.findById(id);
	}

	@Override
	public ManageKeyWord updatemanageKeyword(Integer id, ManageKeyWord maWord) {
		ManageKeyWord updatedManageKeyword = managekeywordRepositiory.findById(id).orElse(null);
		updatedManageKeyword.setKeywords(maWord.getKeywords());
		updatedManageKeyword.setUpdated_at(maWord.getUpdated_at());
		return managekeywordRepositiory.save(updatedManageKeyword);

	}

	@Override
	public void deleteManageKeyword(Integer id) {
		managekeywordRepositiory.deleteById(id);

	}

	@Override
	public Optional<Publisher> updateByPublisherId(Integer id) {

		return publisherRepository.findById(id);
	}

	@Override
	public Publisher updatePublisherDetail(Integer id, Publisher publish) {
		Publisher updatePublisher = publisherRepository.findById(id).orElse(null);

		updatePublisher.setName(publish.getName());
		updatePublisher.setEmail(publish.getEmail());
		updatePublisher.setPhone(publish.getPhone());
		updatePublisher.setCity(publish.getCity());
		updatePublisher.setCountry(publish.getCountry());
		if (publish.getStatus1() != null) {
			if (publish.getStatus1().equals("on")) {
				updatePublisher.setStatus(1);
			}
		}

		else {
			updatePublisher.setStatus(0);
		}

		if (publish.getEv1() != null) {
			if (publish.getEv1().equals("on")) {
				updatePublisher.setEv(1);
			}
		}

		else {
			updatePublisher.setEv(0);
		}

		if (publish.getSv1() != null) {
			if (publish.getSv1().equals("on")) {
				updatePublisher.setSv(1);
			}
		}

		else {
			updatePublisher.setSv(0);
		}

		if (publish.getTs1() != null) {
			if (publish.getTs1().equals("on")) {
				updatePublisher.setTs(1);
			}
		}

		else {
			updatePublisher.setTs(0);
		}

		if (publish.getTv1() != null) {
			if (publish.getTv1().equals("on")) {
				updatePublisher.setTv(1);
			}
		}

		else {
			updatePublisher.setTv(0);
		}

		return publisherRepository.save(updatePublisher);
	}

	@Override
	public Optional<Advertiser> updateByAdvertiserId(Integer id) {

		return advertiserRepository.findById(id);
	}

	@Override
	public Advertiser updateAdvertiserDetail(Integer id, Advertiser advertiser) {

		Advertiser updateAdvertiser = advertiserRepository.findById(id).orElse(null);

		updateAdvertiser.setName(advertiser.getName());
		updateAdvertiser.setEmail(advertiser.getEmail());
		updateAdvertiser.setPhone(advertiser.getPhone());
		updateAdvertiser.setCity(advertiser.getCity());
		updateAdvertiser.setCountry(advertiser.getCountry());
		if (advertiser.getStatus1() != null) {
			if (advertiser.getStatus1().equals("on")) {
				updateAdvertiser.setStatus(1);
			}
		}

		else {
			updateAdvertiser.setStatus(0);
		}

		if (advertiser.getEv1() != null) {
			if (advertiser.getEv1().equals("on")) {
				updateAdvertiser.setEv(1);
			}
		}

		else {
			updateAdvertiser.setEv(0);
		}

		if (advertiser.getSv1() != null) {
			if (advertiser.getSv1().equals("on")) {
				updateAdvertiser.setSv(1);
			}
		}

		else {
			updateAdvertiser.setSv(0);
		}

		if (advertiser.getTs1() != null) {
			if (advertiser.getTs1().equals("on")) {
				updateAdvertiser.setTs(1);
			}
		}

		else {
			updateAdvertiser.setTs(0);
		}

		if (advertiser.getTv1() != null) {
			if (advertiser.getTv1().equals("on")) {
				updateAdvertiser.setTv(1);
			}
		}

		else {
			updateAdvertiser.setTv(0);
		}

		return advertiserRepository.save(updateAdvertiser);
	}

	@Override
	public List<AdType> getAllAidTpe() {
		return aidTypeRepository.findAll();
	}

	@Override
	public Integer addAidType(AdType aidType) {

		if (aidType.getStatus() != null) {
			if (aidType.getStatus().equals("on")) {
				aidType.setStatus("1");
			}
		} else {
			aidType.setStatus("0");
		}
		if (aidTypeRepository.save(aidType) != null) {
			return 1;
		}
		return 0;
	}

	@Override
	public Optional<AdType> updateAidById(Integer id) {

		return aidTypeRepository.findById(id);
	}

	@Override
	public AdType updateAidType(Integer id, AdType aidType) {
		AdType updatedAidtype = aidTypeRepository.findById(id).orElse(null);
		updatedAidtype.setAdName(aidType.getAdName());
		updatedAidtype.setWidth(aidType.getWidth());
		updatedAidtype.setHeight(aidType.getHeight());
		if (aidType.getStatus() != null) {
			if (aidType.getStatus().equals("on")) {
				updatedAidtype.setStatus("1");
			}
		} else {
			updatedAidtype.setStatus("0");
		}

		return aidTypeRepository.save(updatedAidtype);
	}

	@Override
	public List<PmntGtway> getAllPaymentGateway() {
		return gatewayRepository.findAll();
	}

	@Override
	public Optional<PmntGtway> updategateWayByName(String name) {
		return Optional.ofNullable(gatewayRepository.findbyName(name));

	}

	

	@Override
	public List<PublisherEarningLog> getAllPubLog() {

		return earnLogrepository.findAll();
	}

	@Override
	@Transactional
	public List<AdvTransactionLog> getAllAdvTxLog() {

		return advTxLogrepository.findAll();
	}

	@Override
	public List<UserLoginHistory> getAllUserLogin() {

		return historyRepository.findAll();
	}

	@Override
	public List<Deposit> getAllPendingDeposit() {
		
		return depositRepository.getAllPendingDeposit();
	}

	@Override
	public List<Deposit> getAllApprovedDeposit() {
		
		return depositRepository.getAllApprovedDeposit();
	}

	@Override
	public List<Deposit> getAllSuccesDeposit() {
		return depositRepository.getAllSuccessDeposit();
	}

	@Override
	public List<Deposit> getAllRejectedDeposit() {
		return depositRepository.getAllRejectedDeposit();
	}

	@Override
	public List<Deposit> getAllDeposit() {
		return depositRepository.findAll();
	}

	@Override
	public List<WithDrawMethod> getAllWithdrawMethod() {

		return methodRepository.findAll();
	}

	@Override
	public Integer addWithdrawMethodType(WithDrawMethod method, MultipartFile file) {
		int status = 0;
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if (fileName.contains("..")) {
			System.out.println("not a a valid file");
		}
		try {
			method.setImage(file.getBytes());

			if (methodRepository.save(method) != null) {
				status = 1;
			} else {
				status = 0;
			}
		} catch (Exception e) {
			System.out.println("Exception while saving data in withdraw method");
		}
		return status;
	}

	@Override
	public List<Ticket> getAllTicket() {

		return ticketRepository.findAll();
	}

	/* All advertise started....... */
	@Override
	public List<Advertise> getAllAdvertise() {

		return advertiseRepository.findAll();
	}

	@Override
	public List<PricePlan> getAllPricePlan() {

		return planRepository.findAll();
	}

	@Override
	public List<IpLog> getAllIpLog() {

		return iplogRepository.findAll();
	}

	@Override
	public List<BlockedIpLog> getAllBlockIpLog() {
		return blockedIpRepository.findAll();
	}

	@Override
	public Integer addPricePlan(PricePlan plan) {
		if (plan.getStatus1() != null) {
			if (plan.getStatus1().equals("on")) {
				plan.setStatus(1);
			}
		} else {
			plan.setStatus(0);
		}
		plan.setType(plan.getType().substring(0, 1).toUpperCase() + plan.getType().substring(1));
		if (planRepository.save(plan) != null) {
			return 1;
		}
		return 0;
	}

	@Override
	public Optional<PricePlan> updatePricePlanById(Integer id) {

		return planRepository.findById(id);
	}

	@Override
	public PricePlan updatePricePlan(Integer id, PricePlan plan) {
		PricePlan updatePlan = planRepository.findById(id).orElse(null);

		updatePlan.setName(plan.getName());
		updatePlan.setPrice(plan.getPrice());
		updatePlan.setType(plan.getType().substring(0, 1).toUpperCase() + plan.getType().substring(1));
		updatePlan.setCredit(plan.getCredit());
		if (plan.getStatus1() != null) {
			if (plan.getStatus1().equals("on")) {
				updatePlan.setStatus(1);
			}
		} else {
			updatePlan.setStatus(0);
		}

		return planRepository.save(updatePlan);
	}

	@Override
	public GlobalSetting getCpcAndCpm() {
		
		return globalSettingRepository.getGlobalSetting();
	}

	@Override
	public void updateCpcAndCpm(Integer id, double cpc, double cpm) {
		globalSettingRepository.updateCpcAndCpmById(id, cpc, cpm);
		
	}

	@Override
	public List<Domain> getAllApprovedDomain() {
		
		return domainRepository.findAll();
	}

	@Override
	public List<Domain> getAllPendingDomain() {
		
		return domainRepository.getAllPendingDomain();
	}
//For all Withdrawls
	@Override
	public List<WithDrawls> getAllWithdrawls() {
	
		return withdrawRepository.findAll();
	}

	@Override
	public List<WithDrawls> getAllPendingWithdrawls() {
		return withdrawRepository.getAllPendingWithdraw();
	}

	@Override
	public List<WithDrawls> getAllApprovedWithdrawls() {
		return withdrawRepository.getAllApprovedWithdraw();
	}

	@Override
	public List<WithDrawls> getAllRejectedWithdrawls() {
		return withdrawRepository.getAllRejectedWithdraw();
	}

	@Override
	public List<UserLoginHistory> getAllPublisherLogin(Integer pid) {
		
		return historyRepository.getAllPublisherLog(pid);
	}

	@Override
	public List<UserLoginHistory> getAllPublisherLoginIp(String ip) {
		
		return historyRepository.getAllPublisherHistoryIpLog(ip);
	}

	@Override
	@Transactional
	public void saveOrUpdateAdvAndTrans(String amount,Advertiser advertiser, AdvTransactionLog advTransactionLog) {
		Advertiser updateAdv=advertiserRepository.findById(advertiser.getId()).orElse(null);
		updateAdv.setBalance(Double.parseDouble(amount)+advertiser.getBalance());
		if(advertiserRepository.save(updateAdv)!=null)
		{
			if(advTxLogrepository.count()==0)
			{
				
				advTransactionLog.setDate(new Date());
				advTransactionLog.setTrx("");
				advTransactionLog.setAmount(Double.parseDouble(amount));
				advTransactionLog.setCharge(0);
				advTransactionLog.setPost_balance(Double.parseDouble(amount));
				advTransactionLog.setDetails(GeneralConstant.adminMsg);
				advTxLogrepository.save(advTransactionLog);
			}
			else   
			{
				AdvTransactionLog updateLog=advTxLogrepository.findById(advertiser.getId().longValue()).orElse(null);
				
				advTransactionLog.setDate(new Date());
				advTransactionLog.setTrx("");
				advTransactionLog.setAmount(Double.parseDouble(amount));
				advTransactionLog.setCharge(0);
				advTransactionLog.setPost_balance(updateLog.getAmount()+updateLog.getPost_balance());
				advTransactionLog.setDetails(GeneralConstant.adminMsg);
				advTxLogrepository.save(advTransactionLog);
			}
			
		
			
			
		}
		
		
		
		
	}

	@Override
	public List<Ticket> getAllPendingTicket() {
	
		return ticketRepository.getAllPendingTicket();
	}

	@Override
	public List<Ticket> getAllClosedTicket() {
		return ticketRepository.getAllclosedTicket();
	}

	@Override
	public List<Ticket> getAllAnsweredTicket() {
		return ticketRepository.getAllAnsweredTicket();
	}

	@Override
	public Ticket getTicketStatus(Integer id) {
		return ticketRepository.findById(id).orElse(null);
	}

	@Override
	public List<UserLoginHistory> getAllAdvertiserLogin(Integer aid) {
		return historyRepository.getAllAdvertiserLog(aid);
	}

	@Override
	public List<UserLoginHistory> getAllAdvertiserLoginIp(String ip) {
		return historyRepository.getAllAdvertiserIpLog(ip);
	}
}
