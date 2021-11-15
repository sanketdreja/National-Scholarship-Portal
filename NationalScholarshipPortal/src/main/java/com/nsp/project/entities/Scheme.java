package com.nsp.project.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Scheme")
public class Scheme {
	
	@Id
	private Long schemeId;
	
	private String schemeName;
	
	private LocalDate lastDateToApply;
	
	private int amount ;
	
	
	
	@ManyToMany(fetch = FetchType.EAGER , cascade =CascadeType.ALL)
	@JoinTable(name ="Student",	joinColumns={@JoinColumn(name="student_id")},
			inverseJoinColumns={@JoinColumn(name="scheme_id")})
	private Set<Scheme> scheme = new HashSet<>();


	

	public Long getSchemeId() {
		return schemeId;
	}


	public void setSchemeId(Long schemeId) {
		this.schemeId = schemeId;
	}


	public String getSchemeName() {
		return schemeName;
	}


	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}


	public LocalDate getLastDateToApply() {
		return lastDateToApply;
	}


	public void setLastDateToApply(LocalDate lastDateToApply) {
		this.lastDateToApply = lastDateToApply;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	
}