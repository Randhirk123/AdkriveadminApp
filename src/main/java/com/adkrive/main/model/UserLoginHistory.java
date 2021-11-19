package com.adkrive.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.ReadOnlyProperty;

@Entity
@Table(name = "user_logins")
@DynamicUpdate
public class UserLoginHistory {  


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="publisher_id")
	private int publisher_id;
	
	@Column(name="advertiser_id")
	private int advertiser_id;
	
	//@ReadOnlyProperty
	@Transient
	private String username;
	@Column(name="user_ip")
	private String user_ip;
	
	@Column(name="location")
	private String location;
	
	@Column(name="browser")
	private String browser;
	
	@Column(name="os")
	private String os;
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="country")
	private String country;
	
	@Column(name="country_code")
	private String country_code;
	
	@Column(name="created_at", insertable=true, updatable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date created_at;
	
	@Column(name="updated_at", insertable=true, updatable=true,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date updated_at;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	public int getAdvertiser_id() {
		return advertiser_id;
	}

	public void setAdvertiser_id(int advertiser_id) {
		this.advertiser_id = advertiser_id;
	}

	public String getUser_ip() {
		return user_ip;
	}

	public void setUser_ip(String user_ip) {
		this.user_ip = user_ip;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
