package com.homeinsurance.entities;

import java.util.List;

import javax.persistence.*;

@Entity
public class Department {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	private String deptName;
	@OneToMany(mappedBy = "department", cascade = CascadeType.REMOVE)
	private List<Regulation> allRegulations;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String deptName, List<Regulation> allRegulations) {
		super();
		this.deptName = deptName;
		this.allRegulations = allRegulations;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Regulation> getAllRegulations() {
		return allRegulations;
	}

	public void setAllRegulations(List<Regulation> allRegulations) {
		this.allRegulations = allRegulations;
	}	

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", allRegulations=" + allRegulations + "]";
	}

	
	

}
