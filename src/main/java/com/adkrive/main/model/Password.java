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
@Table(name ="admin_password_resets")
public class Password {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Transient
	private String password;
	@Transient
	private String newPassword;
	@Transient
	private String confPassword;
	@Column(name="email")
	private String email;
	
	@Column(name = "reset_password_token")
    private String resetPasswordToken;
	
	@Column(name = "status")
	private int status;
	@Column(name="created_at", insertable=false, updatable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date created_at;
	
	@Column(name="updated_at", insertable=false, updatable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date updated_at;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfPassword() {
		return confPassword;
	}

	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
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

	
}
