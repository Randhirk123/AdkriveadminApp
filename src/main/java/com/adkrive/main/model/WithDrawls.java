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
@Table(name = "withdrawals")
@DynamicUpdate
public class WithDrawls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="method_id")
	private int method_id;
	
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="rate")
	private double rate;
	
	@Column(name="charge")
	private double charge;
	
	@Column(name="trx")
	private String trx;
	
	@Column(name="final_amount")
	private double final_amount;
	
	@Column(name="after_charge")
	private double after_charge;
	
	@Column(name="withdraw_information")
	private String withdraw_information;
	
	@Column(name="status")
	private int status;
	
	@Column(name="admin_feedback")
	private String admin_feedback;
	
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

	public int getMethod_id() {
		return method_id;
	}

	public void setMethod_id(int method_id) {
		this.method_id = method_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public String getTrx() {
		return trx;
	}

	public void setTrx(String trx) {
		this.trx = trx;
	}

	public double getFinal_amount() {
		return final_amount;
	}

	public void setFinal_amount(double final_amount) {
		this.final_amount = final_amount;
	}

	public double getAfter_charge() {
		return after_charge;
	}

	public void setAfter_charge(double after_charge) {
		this.after_charge = after_charge;
	}

	public String getWithdraw_information() {
		return withdraw_information;
	}

	public void setWithdraw_information(String withdraw_information) {
		this.withdraw_information = withdraw_information;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getAdmin_feedback() {
		return admin_feedback;
	}

	public void setAdmin_feedback(String admin_feedback) {
		this.admin_feedback = admin_feedback;
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
