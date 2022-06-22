package com.dbmsproject.model;

import com.dbmsproject.form.CustomerForm;

public class CustomerInfo {

	private String name;
	private String addr;
	private String email;
	private String phone;
	
	private boolean valid;

	public CustomerInfo() {
	}

	public CustomerInfo(CustomerForm form) {
		this.name = form.getName();
		this.addr = form.getAddr();
		this.email = form.getEmail();
		this.phone = form.getPhone();
		this.valid = form.isValid();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

}
