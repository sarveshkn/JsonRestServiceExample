/**
 * 
 */
package com.practise.model;

import java.io.Serializable;

/**
 * @author skaushik
 *
 */
public class Address implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1099L;

	@Override
	public String toString() {
		return "Address [postalCode=" + postalCode + ", street=" + street + "]";
	}

	private String postalCode;
	
	private String street;

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
