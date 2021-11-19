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
@Table(name = "create_ads")
@DynamicUpdate
public class Advertise {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="advertiser_id")
	private int advertiser_id;
	
	@Column(name="ad_type_id")
	private int ad_type_id;
	
	@Column(name="track_id")
	private String track_id;
	
	@Column(name="ad_name")
	private String ad_name;
	
	@Column(name="ad_title")
	private String ad_title;
	
	@Column(name="redirect_url")
	private String redirect_url;
	
	@Column(name="ad_type")
	private String ad_type;
	
	@Column(name="image")
	private String image;
	
	@Column(name="clicked")
	private int clicked;
	
	@Column(name="impression")
	private int impression;
	
	@Column(name="status")
	private int status;
	
	@Column(name="resolution")
	private String resolution;
	
	@Column(name="t_country")
	private String t_country;
	
	@Column(name="global")
	private int global;
	
	@Column(name="keywords")
	private String keywords;
	
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

	public int getAdvertiser_id() {
		return advertiser_id;
	}

	public void setAdvertiser_id(int advertiser_id) {
		this.advertiser_id = advertiser_id;
	}

	public int getAd_type_id() {
		return ad_type_id;
	}

	public void setAd_type_id(int ad_type_id) {
		this.ad_type_id = ad_type_id;
	}

	public String getTrack_id() {
		return track_id;
	}

	public void setTrack_id(String track_id) {
		this.track_id = track_id;
	}

	public String getAd_name() {
		return ad_name;
	}

	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}

	public String getAd_title() {
		return ad_title;
	}

	public void setAd_title(String ad_title) {
		this.ad_title = ad_title;
	}

	public String getRedirect_url() {
		return redirect_url;
	}

	public void setRedirect_url(String redirect_url) {
		this.redirect_url = redirect_url;
	}

	public String getAd_type() {
		return ad_type;
	}

	public void setAd_type(String ad_type) {
		this.ad_type = ad_type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getClicked() {
		return clicked;
	}

	public void setClicked(int clicked) {
		this.clicked = clicked;
	}

	public int getImpression() {
		return impression;
	}

	public void setImpression(int impression) {
		this.impression = impression;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getT_country() {
		return t_country;
	}

	public void setT_country(String t_country) {
		this.t_country = t_country;
	}

	public int getGlobal() {
		return global;
	}

	public void setGlobal(int global) {
		this.global = global;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
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
