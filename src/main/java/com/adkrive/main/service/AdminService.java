package com.adkrive.main.service;

import java.util.List;
import java.util.Optional;

import javax.mail.Multipart;

import org.springframework.web.multipart.MultipartFile;

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
import com.adkrive.main.serviceImpl.CustomerNotFoundException;




public interface AdminService {

	
	//for password setting
	public Admin getAdminDetailsByEmail(String email);

	public void updateResetPasswordToken(String token, String email) throws CustomerNotFoundException;

	public Admin getByResetPasswordToken(String token);

	public void updatePassword(Admin customer, String password);

	//public boolean updateAdminDetails(Admin customer, String name,String email,byte[] image);

	public Profile getImages(long id);

	Integer fetchOrUpdateProfile(MultipartFile file, String name, String email);

	public Profile checkProfileRecord();

	public boolean saveNewPassword(Password pass);
	
	//All publishers functionality prototype
	
	public List<Publisher> getAllPublisher();
	public List<Publisher> getAllActivePublisher();
	public List<Publisher> getAllBannedPublisher();
	public List<Publisher> getAllEmailUnverifiedPublisher();
	public List<Publisher> getAllSmslUnverifiedPublisher();
	public boolean sendEmailToAllPublisher();

	public List<Publisher> searchPublisherByNameOrEmail(String value);
	
	
	
	//All Advertiser functionality prototype
		public List<Country> getListOfCountries();

		public List<Advertiser> getAllAdvertiser();

		public List<Advertiser> getAllActiveAdvertiser();

		public List<Advertiser> getAllBannedAdvertiser();

		public List<Advertiser> getAllEmailUnverifiedAdvertiser();

		public List<Advertiser> getAllSmslUnverifiedAdvertiser();

		public List<Advertiser> searchAdvertiserByNameOrEmail(String value);


	//public Admin findByImage(byte[] image);

	public boolean matchAdminLoginDetails(String userName, String password);

	public Password getPassWordDetails();

	public boolean updateAdminDetails(String name, String email,byte[] image);
	public boolean upDatePassWordEmail(String email);

	public Admin getAdminDetails();

	
	
	//for Managekeyword
	public Integer addKeyWords(ManageKeyWord maWord);
	public List<ManageKeyWord> getAllManageKeyword();

	public Optional<ManageKeyWord> updateById(Integer id);

	public ManageKeyWord updatemanageKeyword(Integer id, ManageKeyWord maWord);

	public void deleteManageKeyword(Integer id);
	
	//for publisher
	public Optional<Publisher> updateByPublisherId(Integer id);

	public Publisher updatePublisherDetail(Integer id, Publisher publish);

	public Optional<Advertiser>  updateByAdvertiserId(Integer id);

	public Advertiser updateAdvertiserDetail(Integer id, Advertiser advertiser);

	//for AidType
	public List<AdType> getAllAidTpe();
	public Integer addAidType(AdType aidType);
	public Optional<AdType> updateAidById(Integer id);
	public AdType updateAidType(Integer id, AdType aidType);

	public List<PmntGtway> getAllPaymentGateway();

	public Optional<PmntGtway> updategateWayByName(String name);

	

	public List<PublisherEarningLog> getAllPubLog();

	public List<AdvTransactionLog> getAllAdvTxLog();

	public List<UserLoginHistory> getAllUserLogin();
//for Deposit
	public List<Deposit> getAllPendingDeposit();

	public List<Deposit> getAllApprovedDeposit();

	public List<Deposit> getAllSuccesDeposit();

	public List<Deposit> getAllRejectedDeposit();

	public List<Deposit> getAllDeposit();

	public List<WithDrawMethod> getAllWithdrawMethod();

	public Integer addWithdrawMethodType(WithDrawMethod method, MultipartFile file);

	public List<Ticket> getAllTicket();

	public List<Advertise> getAllAdvertise();

	public List<PricePlan> getAllPricePlan();

	public List<IpLog> getAllIpLog();

	public List<BlockedIpLog> getAllBlockIpLog();

	public Integer addPricePlan(PricePlan plan);

	public Optional<PricePlan> updatePricePlanById(Integer id);

	public PricePlan updatePricePlan(Integer id, PricePlan plan);

	public GlobalSetting getCpcAndCpm();

	public void updateCpcAndCpm(Integer id, double cpc, double cpm);

	public List<Domain> getAllApprovedDomain();

	public List<Domain> getAllPendingDomain();
//For Withdrawls
	public List<WithDrawls> getAllWithdrawls();

	public List<WithDrawls> getAllPendingWithdrawls();

	public List<WithDrawls> getAllApprovedWithdrawls();

	public List<WithDrawls> getAllRejectedWithdrawls();

	public List<UserLoginHistory> getAllPublisherLogin(Integer pid);

	public List<UserLoginHistory> getAllPublisherLoginIp(String ip);

	public void saveOrUpdateAdvAndTrans(String amount, Advertiser advertiser, AdvTransactionLog advTransactionLog);

	public List<Ticket> getAllPendingTicket();

	public List<Ticket> getAllClosedTicket();

	public List<Ticket> getAllAnsweredTicket();

	public Ticket getTicketStatus(Integer id);

	public List<UserLoginHistory> getAllAdvertiserLogin(Integer aid);

	public List<UserLoginHistory> getAllAdvertiserLoginIp(String ip);

}
