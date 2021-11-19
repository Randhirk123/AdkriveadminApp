package com.adkrive.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "publishers")
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="username")
	private String username;
	
	@Column(name="image")
	private String image;
	
	@Column(name="country")
	private String country;
	
	@Column(name="city")
	private String city;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="password")
	private String password;
	
	@Column(name="earnings")
	private double earnings;
	
	@Column(name="status")
	private Integer status;
	
	@Transient
	private String status1;
	
	@Column(name="total_imp")
	private Integer total_imp;
	
	@Column(name="total_click")
	private Integer total_click;
	
	
	@Column(name="ev")
	private Integer  ev;
	
	@Transient
	private String ev1;
	
	@Column(name="sv")
	private Integer  sv;
	
	@Transient
	private String sv1;
	
	@Column(name="ts")
	private Integer ts;
	
	@Transient
	private String ts1;
	
	@Column(name="tv")
	private Integer  tv;
	
	@Transient
	private String tv1;
	
	@Column(name="tsc")
	private String tsc;
	
	@Column(name="ver_code")
	private String ver_code;
	
	
	@Column(name="created_at", insertable=false, updatable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date created_at;
	
	@Column(name="updated_at", insertable=false, updatable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTotal_imp() {
		return total_imp;
	}

	public void setTotal_imp(Integer total_imp) {
		this.total_imp = total_imp;
	}

	public Integer getTotal_click() {
		return total_click;
	}

	public void setTotal_click(Integer total_click) {
		this.total_click = total_click;
	}

	public Integer getEv() {
		return ev;
	}

	public void setEv(Integer ev) {
		this.ev = ev;
	}

	public Integer getSv() {
		return sv;
	}

	public void setSv(Integer sv) {
		this.sv = sv;
	}

	public Integer getTs() {
		return ts;
	}

	public void setTs(Integer ts) {
		this.ts = ts;
	}

	public Integer getTv() {
		return tv;
	}

	public void setTv(Integer tv) {
		this.tv = tv;
	}

	public String getTsc() {
		return tsc;
	}

	public void setTsc(String tsc) {
		this.tsc = tsc;
	}

	public String getVer_code() {
		return ver_code;
	}

	public void setVer_code(String ver_code) {
		this.ver_code = ver_code;
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

	public String getStatus1() {
		return status1;
	}

	public void setStatus1(String status1) {
		this.status1 = status1;
	}

	public String getEv1() {
		return ev1;
	}

	public void setEv1(String ev1) {
		this.ev1 = ev1;
	}

	public String getSv1() {
		return sv1;
	}

	public void setSv1(String sv1) {
		this.sv1 = sv1;
	}

	public String getTs1() {
		return ts1;
	}

	public void setTs1(String ts1) {
		this.ts1 = ts1;
	}

	public String getTv1() {
		return tv1;
	}

	public void setTv1(String tv1) {
		this.tv1 = tv1;
	}

	
	

	
	
}
