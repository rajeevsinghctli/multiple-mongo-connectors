package com.ctl.rxkuma7.multiplemongo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@XmlAccessorType(XmlAccessType.FIELD)
 

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name ="ban")
	private String ban;

	@XmlElement(name ="accountType")
	private String accountType;
	
	@XmlElement(name ="accountSubType")
	private String accountSubType;
	
	@XmlElement(name ="billingType")
	private String billingType;

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountSubType() {
		return accountSubType;
	}

	public void setAccountSubType(String accountSubType) {
		this.accountSubType = accountSubType;
	}

	public String getBillingType() {
		return billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
