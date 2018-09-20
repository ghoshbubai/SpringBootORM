package com.sony;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String ename;
	private int epoints;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEpoints() {
		return epoints;
	}
	public void setEpoints(int epoints) {
		this.epoints = epoints;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", epoints=" + epoints + "]";
	}
	
}
