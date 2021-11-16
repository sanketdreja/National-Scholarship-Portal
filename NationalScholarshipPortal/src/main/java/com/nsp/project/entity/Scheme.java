package com.nsp.project.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Scheme")
public class Scheme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long schemeId;
	
	private String schemeName;
	
	private LocalDate lastDateToApply;
	
	private int amount ;
	
	
	
	@ManyToMany(fetch = FetchType.EAGER , cascade =CascadeType.ALL)
	@JoinTable(name ="Student",	joinColumns={@JoinColumn(name="STUDENT_ID")},
			inverseJoinColumns={@JoinColumn(name="SCHEME_ID")})
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
