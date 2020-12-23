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
public class AddressInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@XmlElement(name = "source")
	private String source;


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}
	
}
