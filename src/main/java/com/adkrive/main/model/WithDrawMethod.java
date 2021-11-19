package com.adkrive.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "withdraw_methods")
@DynamicUpdate
public class WithDrawMethod {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Lob
	@Column(name="image")
	@Type(type="org.hibernate.type.BinaryType")
	private byte[] image;
	
	@Transient
	private String convertImage;
	@Column(name="min_limit")
	private double min_limit;
	
	@Column(name="max_limit")
	private double max_limit;
	
	@Column(name="delay")
	private String delay;
	
	@Column(name="fixed_charge")
	private double fixed_charge;
	
	@Column(name="rate")
	private double rate;
	
	@Column(name="percent_charge")
	private double percent_charge;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="user_data")
	private String user_data;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private int status;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public double getMin_limit() {
		return min_limit;
	}

	public void setMin_limit(double min_limit) {
		this.min_limit = min_limit;
	}

	public double getMax_limit() {
		return max_limit;
	}

	public void setMax_limit(double max_limit) {
		this.max_limit = max_limit;
	}

	public String getDelay() {
		return delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	public double getFixed_charge() {
		return fixed_charge;
	}

	public void setFixed_charge(double fixed_charge) {
		this.fixed_charge = fixed_charge;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getPercent_charge() {
		return percent_charge;
	}

	public void setPercent_charge(double percent_charge) {
		this.percent_charge = percent_charge;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getUser_data() {
		return user_data;
	}

	public void setUser_data(String user_data) {
		this.user_data = user_data;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public String getConvertImage() {
		return convertImage;
	}

	public void setConvertImage(String convertImage) {
		this.convertImage = convertImage;
	}
	
	   
}
