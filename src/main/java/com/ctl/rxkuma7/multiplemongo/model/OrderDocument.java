package com.ctl.rxkuma7.multiplemongo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author ab84233
 *
 */
@Component
@XmlAccessorType(XmlAccessType.FIELD)
 
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDocument implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "serviceAddress")
	private AddressInfo serviceAddress;
	
	@XmlElement(name = "accountInfo")
	private AccountInfo accountInfo;

	public AddressInfo getServiceAddress() {
		return serviceAddress;
	}

	public void setServiceAddress(AddressInfo serviceAddress) {
		this.serviceAddress = serviceAddress;
	}

	public AccountInfo getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

}