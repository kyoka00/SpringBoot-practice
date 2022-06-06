package com.example.demo.entity;

public class Major {
	private Integer majorId;
	private String majorName;
	
	public Major() {
	}
	public Major(Integer majorId, String majorName) {
		this.majorId = majorId;
		this.majorName = majorName;
	}
	public Integer getMajorId() {
		return majorId;
	}
	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	 public String getMajorInfo() {
		 return this.majorId + ", " + this.majorName ;
	 }
	
}
