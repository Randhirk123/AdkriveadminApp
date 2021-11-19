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
@Table(name = "ip_logs")
@DynamicUpdate
public class IpLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "ip_id")
	private Integer ip_id;

	@Column(name = "country")
	private String country;
	
	@Column(name = "ad_id")
	private String ad_id;
	
	@Column(name = "ad_type")
	private String ad_type;
	
	
	@Column(name = "time", insertable=false, updatable=false)
	private Date time;
	@Column(name="created_at", insertable=false, updatable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date created_at;
	
	@Column(name="updated_at", insertable=false, updatable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date updated_at;


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAd_id() {
		return ad_id;
	}

	public void setAd_id(String ad_id) {
		this.ad_id = ad_id;
	}

	public String getAd_type() {
		return ad_type;
	}

	
	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public void setIp_id(Integer ip_id) {
		this.ip_id = ip_id;
	}

	public void setAd_type(String ad_type) {
		this.ad_type = ad_type;
	}

	public java.util.Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(java.util.Date created_at) {
		this.created_at = created_at;
	}

	public java.util.Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(java.util.Date updated_at) {
		this.updated_at = updated_at;
	}
}
