package com.ust.springbootjpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Country {
	
	@Id
	private String id;
	
	private String capital;
	
	private String country;

	public Country(String id, String capital, String country) {
		super();
		this.id = id;
		this.capital = capital;
		this.country = country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	

}
