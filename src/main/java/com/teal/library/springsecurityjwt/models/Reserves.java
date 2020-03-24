package com.teal.library.springsecurityjwt.models;

import java.sql.Date;

public class Reserves {
	private int resNumber;
	private int readerId;
	private int docId;
	private String copyId;
	private int libId;
	private Date dDate;
	public Reserves(int resNumber, int readerId, int docId, String copyId, int libId, Date dDate) {
		super();
		this.resNumber = resNumber;
		this.readerId = readerId;
		this.docId = docId;
		this.copyId = copyId;
		this.libId = libId;
		this.dDate = dDate;
	}
	public int getResNumber() {
		return resNumber;
	}
	public void setResNumber(int resNumber) {
		this.resNumber = resNumber;
	}
	public int getReaderId() {
		return readerId;
	}
	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getCopyId() {
		return copyId;
	}
	public void setCopyId(String copyId) {
		this.copyId = copyId;
	}
	public int getLibId() {
		return libId;
	}
	public void setLibId(int libId) {
		this.libId = libId;
	}
	public Date getdDate() {
		return dDate;
	}
	public void setdDate(Date dDate) {
		this.dDate = dDate;
	}
	@Override
	public String toString() {
		return "Reserves [resNumber=" + resNumber + ", readerId=" + readerId + ", docId=" + docId + ", copyId=" + copyId
				+ ", libId=" + libId + ", dDate=" + dDate + "]";
	}
	

}
