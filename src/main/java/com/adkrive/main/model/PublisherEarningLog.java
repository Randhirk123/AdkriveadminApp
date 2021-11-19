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
@Table(name = "earning_logs")
@DynamicUpdate

public class PublisherEarningLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="publisher_id")
	private Integer publisher_id;
	
	@Column(name="ad_id")
	private Integer ad_id;
	
	@Column(name="ad_type")
	private String ad_type;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="date")
	private Date date;
	@Column(name="created_at", insertable=true, updatable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date created_at;
	
	@Column(name="updated_at", insertable=true, updatable=true,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date updated_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(Integer publisher_id) {
		this.publisher_id = publisher_id;
	}

	public Integer getAd_id() {
		return ad_id;
	}

	public void setAd_id(Integer ad_id) {
		this.ad_id = ad_id;
	}

	public String getAd_type() {
		return ad_type;
	}

	public void setAd_type(String ad_type) {
		this.ad_type = ad_type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
