package com.ctl.rxkuma7.multiplemongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Marcos Barbero
 */
@Component
@XmlAccessorType(XmlAccessType.FIELD)

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "orderReference")
	private OrderReference orderReference;
	
	@XmlElement(name = "orderDocument")
	private OrderDocument orderDocument;
	
	@Id
	public String id;

	public String getId() {
		return id;
	}

	public OrderReference getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(OrderReference orderReference) {
		this.id = orderReference.getOrderReferenceNumber();
		this.orderReference = orderReference;
	}
	
	public OrderDocument getOrderDocument() {
		return orderDocument;
	}

	public void setOrderDocument(OrderDocument orderDocument) {
		this.orderDocument = orderDocument;
	}
}



