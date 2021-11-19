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
@Table(name = "deposits")
@DynamicUpdate
public class Deposit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="user_id")
	private Integer user_id;
	
	@Column(name="method_code")
	private Integer method_code;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="method_currency")
	private String method_currency;
	
	@Column(name="charge")
	private double charge;
	
	@Column(name="rate")
	private double rate;
	
	@Column(name="final_amo")
	private double final_amo;
	
	@Column(name="detail")
	private String detail;
	
	@Column(name="btc_amo")
	private String btc_amo;
	
	@Column(name="btc_wallet")
	private String btc_wallet;
	
	@Column(name="trx")
	private String trx;
	
	@Column(name="try")
	private int tried;
	
	@Column(name="status")
	private int status;
	
	@Column(name="payment_stat")
	private int payment_stat;
	
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

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getMethod_code() {
		return method_code;
	}

	public void setMethod_code(Integer method_code) {
		this.method_code = method_code;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMethod_currency() {
		return method_currency;
	}

	public void setMethod_currency(String method_currency) {
		this.method_currency = method_currency;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getFinal_amo() {
		return final_amo;
	}

	public void setFinal_amo(double final_amo) {
		this.final_amo = final_amo;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getBtc_amo() {
		return btc_amo;
	}

	public void setBtc_amo(String btc_amo) {
		this.btc_amo = btc_amo;
	}

	public String getBtc_wallet() {
		return btc_wallet;
	}

	public void setBtc_wallet(String btc_wallet) {
		this.btc_wallet = btc_wallet;
	}

	public String getTrx() {
		return trx;
	}

	public void setTrx(String trx) {
		this.trx = trx;
	}

	public int getTried() {
		return tried;
	}

	public void setTried(int tried) {
		this.tried = tried;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getPayment_stat() {
		return payment_stat;
	}

	public void setPayment_stat(int payment_stat) {
		this.payment_stat = payment_stat;
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
