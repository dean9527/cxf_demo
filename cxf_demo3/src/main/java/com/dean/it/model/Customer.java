package com.dean.it.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Customer")
public class Customer {
	private Long id;
	private String name;
	private Date birthdary;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdary() {
		return birthdary;
	}
	public void setBirthdary(Date birthdary) {
		this.birthdary = birthdary;
	}
}
