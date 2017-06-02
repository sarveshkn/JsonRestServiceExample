/**
 * 
 */
package com.practise.model;

import java.io.Serializable;

/**
 * @author skaushik
 *
 */
public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1098L;

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	private String name;
	
	private String age;
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	} 
}
