package com.nsp.project.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "State Nodal Officer")
public class StateNodalOfficer {
	
	@Id
	private String stateName;
	
	
	private String password;
	
	
	private String officerName;
	
	
	private Long mobileNumber;
	
	
    private String email;
    
    @OneToMany
    List<InstituteApplication> instApplication;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<InstituteApplication> getInstApplication() {
		return instApplication;
	}

	public void setInstApplication(List<InstituteApplication> instApplication) {
		this.instApplication = instApplication;
	}
	
     
}