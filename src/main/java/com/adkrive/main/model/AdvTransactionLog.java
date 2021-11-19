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

@Entity
@Table(name = "transactions")
@DynamicUpdate
public class AdvTransactionLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int user_id;
	@Column(name="publisher_id")
	private int publisher_id;
	@Column(name="amount")
	private double amount;
	@Column(name="charge")
	private double charge;
	@Column(name="post_balance")
	private double post_balance;
	
	@Transient
	private String username;
	@Column(name="trx_type")
	private String trx_type;
	@Column(name="trx")
	private String trx;
	@Column(name="details")
	private String details;
	@Column(name="date")
	private Date date;
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public double getPost_balance() {
		return post_balance;
	}

	public void setPost_balance(double post_balance) {
		this.post_balance = post_balance;
	}

	public String getTrx_type() {
		return trx_type;
	}

	public void setTrx_type(String trx_type) {
		this.trx_type = trx_type;
	}

	public String getTrx() {
		return trx;
	}

	public void setTrx(String trx) {
		this.trx = trx;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
