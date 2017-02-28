package com.comcast.campaign.campaign;

import javax.xml.bind.annotation.XmlRootElement;

//Beans

@XmlRootElement(name = "User")
public class User {

	private String partner_id;
	private long duration;
	private String ad_content;

	public String getPartner_id() {
		return partner_id;
	}

	public void setPartner_id(String partner_id) {
		this.partner_id = partner_id;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getAd_content() {
		return ad_content;
	}

	public void setAd_content(String ad_content) {
		this.ad_content = ad_content;
	}

}
