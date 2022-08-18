package com.records.entity;

public class Record {
	
	
	private Long cid;
	private String email;
	private String comapnayName;
	private Long eid;
	
	
	public Record(Long cid, String email, String comapnayName, Long eid) {
		super();
		this.cid = cid;
		this.email = email;
		this.comapnayName = comapnayName;
		this.eid = eid;
	}
	
	
	public Long getCid() {
		return cid;
	}
	public String getEmail() {
		return email;
	}
	public String getComapnayName() {
		return comapnayName;
	}
	public Long getEid() {
		return eid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setComapnayName(String comapnayName) {
		this.comapnayName = comapnayName;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	
	

}
