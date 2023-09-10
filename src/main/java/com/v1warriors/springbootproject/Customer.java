package com.v1warriors.springbootproject;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name= "customer_id")
	private String customerId;
	
	@Column(name= "first_name")
	private String firstName;
	
	@Column(name= "last_name")
	private String lastName;
	
	@Column(name="company")
	private String company;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@Column(name="phone1")
	private String phone1;
	
	@Column(name="phone2")
	private String phone2;
	
	@Column(name="email")
	private String email;
	
	@Column(name="subscription_date")
	private Date subscriptionDate;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

}
