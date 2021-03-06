package com.homeinsurance.entities;

import javax.persistence.*;

@Entity
public class Regulation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regId;
	private String regTitle;
	private String description;
	@ManyToOne
	private Department department;

	public Regulation() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Regulation(String regTitle, String description, Department department) {
		super();
		this.regTitle = regTitle;
		this.description = description;
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	

	public int getRegId() {
		return regId;
	}



	public void setRegId(int regId) {
		this.regId = regId;
	}



	public String getRegTitle() {
		return regTitle;
	}



	public void setRegTitle(String regTitle) {
		this.regTitle = regTitle;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Regulation [regId=" + regId + ", regTitle=" + regTitle + ", description=" + description + ", department=" + department + "]";
	}



	
	
	

}
