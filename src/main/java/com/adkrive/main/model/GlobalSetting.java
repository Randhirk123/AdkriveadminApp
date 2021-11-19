package com.adkrive.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "general_settings")
@DynamicUpdate
public class GlobalSetting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "sitename")
	private String sitename;

	@Column(name = "cur_text")
	private String cur_text;

	@Column(name = "cur_sym")
	private String cur_sym;

	@Column(name = "email_from")
	private String email_from;

	@Column(name = "email_template")
	private String email_template;

	@Column(name = "sms_api")
	private String sms_api;

	@Column(name = "base_color")
	private String base_color;

	@Column(name = "secondary_color")
	private String secondary_color;

	@Column(name = "mail_config")
	private String mail_config;

	@Column(name = "ev")
	private int ev;

	@Column(name = "en")
	private int en;

	@Column(name = "sv")
	private int sv;

	@Column(name = "sn")
	private int sn;

	@Column(name = "registration")
	private int registration;

	@Column(name = "social_login")
	private int social_login;

	@Column(name = "social_credential")
	private String social_credential;

	@Column(name = "active_template")
	private String active_template;

	@Column(name = "sys_version")
	private String sys_version;

	@Column(name = "cpc")
	private double cpc;

	@Column(name = "cpm")
	private double cpm;

	@Column(name = "address")
	private String address;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@Column(name = "domain_approval")
	private int domain_approval;

	@Column(name = "intervals")
	private int intervals;

	@Column(name = "location_api")
	private String location_api;

	@Column(name = "created_at", insertable = true, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date created_at;

	@Column(name = "updated_at", insertable = true, updatable = true, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date updated_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getCur_text() {
		return cur_text;
	}

	public void setCur_text(String cur_text) {
		this.cur_text = cur_text;
	}

	public String getCur_sym() {
		return cur_sym;
	}

	public void setCur_sym(String cur_sym) {
		this.cur_sym = cur_sym;
	}

	public String getEmail_from() {
		return email_from;
	}

	public void setEmail_from(String email_from) {
		this.email_from = email_from;
	}

	public String getEmail_template() {
		return email_template;
	}

	public void setEmail_template(String email_template) {
		this.email_template = email_template;
	}

	public String getSms_api() {
		return sms_api;
	}

	public void setSms_api(String sms_api) {
		this.sms_api = sms_api;
	}

	public String getBase_color() {
		return base_color;
	}

	public void setBase_color(String base_color) {
		this.base_color = base_color;
	}

	public String getSecondary_color() {
		return secondary_color;
	}

	public void setSecondary_color(String secondary_color) {
		this.secondary_color = secondary_color;
	}

	public String getMail_config() {
		return mail_config;
	}

	public void setMail_config(String mail_config) {
		this.mail_config = mail_config;
	}

	public int getEv() {
		return ev;
	}

	public void setEv(int ev) {
		this.ev = ev;
	}

	public int getEn() {
		return en;
	}

	public void setEn(int en) {
		this.en = en;
	}

	public int getSv() {
		return sv;
	}

	public void setSv(int sv) {
		this.sv = sv;
	}

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getSocial_login() {
		return social_login;
	}

	public void setSocial_login(int social_login) {
		this.social_login = social_login;
	}

	public String getSocial_credential() {
		return social_credential;
	}

	public void setSocial_credential(String social_credential) {
		this.social_credential = social_credential;
	}

	public String getActive_template() {
		return active_template;
	}

	public void setActive_template(String active_template) {
		this.active_template = active_template;
	}

	public String getSys_version() {
		return sys_version;
	}

	public void setSys_version(String sys_version) {
		this.sys_version = sys_version;
	}

	public double getCpc() {
		return cpc;
	}

	public void setCpc(double cpc) {
		this.cpc = cpc;
	}

	public double getCpm() {
		return cpm;
	}

	public void setCpm(double cpm) {
		this.cpm = cpm;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getDomain_approval() {
		return domain_approval;
	}

	public void setDomain_approval(int domain_approval) {
		this.domain_approval = domain_approval;
	}

	public int getIntervals() {
		return intervals;
	}

	public void setIntervals(int intervals) {
		this.intervals = intervals;
	}

	public String getLocation_api() {
		return location_api;
	}

	public void setLocation_api(String location_api) {
		this.location_api = location_api;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

}
