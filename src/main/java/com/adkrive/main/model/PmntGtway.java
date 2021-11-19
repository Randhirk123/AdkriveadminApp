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
@Table(name = "gateways")
@DynamicUpdate
public class PmntGtway {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "code")
	private int code;

	@Column(name = "alias")
	private String alias;

	@Column(name = "image")
	private byte[] image;

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private int status;

	@Column(name = "parameters")
	private String parameters;

	@Column(name = "supported_currencies")
	private String supported_currencies;

	@Column(name = "crypto")
	private int crypto;

	@Column(name = "extra")
	private String extra;

	@Column(name = "description")
	private String description;

	@Column(name = "input_form")
	private String input_form;
	
	@Column(name = "created_at", insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date created_at;

	@Column(name = "updated_at", insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date updated_at;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getSupported_currencies() {
		return supported_currencies;
	}

	public void setSupported_currencies(String supported_currencies) {
		this.supported_currencies = supported_currencies;
	}

	public int getCrypto() {
		return crypto;
	}

	public void setCrypto(int crypto) {
		this.crypto = crypto;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInput_form() {
		return input_form;
	}

	public void setInput_form(String input_form) {
		this.input_form = input_form;
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
