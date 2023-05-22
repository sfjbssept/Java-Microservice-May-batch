package com.employee.entity;

public class Record {

	private Long cId;
	private String companyName;
	private Long eId;
	
	
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	public Record(Long cId, String companyName, Long eId) {
		super();
		this.cId = cId;
		this.companyName = companyName;
		this.eId = eId;
	}
	public Record() {
		super();
	}
	
	
	
	
}
