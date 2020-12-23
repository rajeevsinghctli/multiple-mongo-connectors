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
public class OrderReference implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@XmlElement(name = "customerOrderStatus")
	private String customerOrderStatus;

	@XmlElement(name = "customerOrderType")
	private String customerOrderType;

	@XmlElement(name = "orderDate")
	private String orderDate;

	@XmlElement(name = "orderReferenceNumber")
	private String orderReferenceNumber;

	@XmlElement(name = "orderVersion")
	private String orderVersion;

	@XmlElement(name = "customerOrderNumber")
	private String customerOrderNumber;
	

	// PRISM changes v3.12
	@XmlElement(name = "sourceSystem")
	private String sourceSystem;

	@XmlElement(name = "supType")
	private String supType;
	
	@XmlElement(name = "salesChannel")
	private String salesChannel;

	public String getCustomerOrderStatus() {
		return customerOrderStatus;
	}

	public void setCustomerOrderStatus(String customerOrderStatus) {
		this.customerOrderStatus = customerOrderStatus;
	}

	public String getCustomerOrderType() {
		return customerOrderType;
	}

	public void setCustomerOrderType(String customerOrderType) {
		this.customerOrderType = customerOrderType;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderReferenceNumber() {
		return orderReferenceNumber;
	}

	public void setOrderReferenceNumber(String orderReferenceNumber) {
		this.orderReferenceNumber = orderReferenceNumber;
	}

	public String getOrderVersion() {
		return orderVersion;
	}

	public void setOrderVersion(String orderVersion) {
		this.orderVersion = orderVersion;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getSupType() {
		return supType;
	}

	public void setSupType(String supType) {
		this.supType = supType;
	}

	public String getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public String getCustomerOrderNumber() {
		return customerOrderNumber;
	}

	public void setCustomerOrderNumber(String customerOrderNumber) {
		this.customerOrderNumber = customerOrderNumber;
	}

}