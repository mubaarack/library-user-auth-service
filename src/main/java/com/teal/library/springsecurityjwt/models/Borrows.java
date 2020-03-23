package com.teal.library.springsecurityjwt.models;

public class Borrows {

	private int borNumber;
	private int readerId;
	private int docId;
	private String copyId;
	private int libId;
	private String bTime;
	private String rTime;
	private double fines;

	public Borrows() {
	}

	public Borrows(int borNumber, int readerId, int docId, String copyId, int libId, String bTime, String rTime,
			double fines) {
		this.borNumber = borNumber;
		this.readerId = readerId;
		this.docId = docId;
		this.copyId = copyId;
		this.libId = libId;
		this.bTime = bTime;
		this.rTime = rTime;
		this.fines = fines;
	}

	public int getBorNumber() {
		return borNumber;
	}

	public void setBorNumber(int borNumber) {
		this.borNumber = borNumber;
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

	public String getbTime() {
		return bTime;
	}

	public void setbTime(String bTime) {
		this.bTime = bTime;
	}

	public String getrTime() {
		return rTime;
	}

	public void setrTime(String rTime) {
		this.rTime = rTime;
	}

	public double getFines() {
		return fines;
	}

	public void setFines(double fines) {
		this.fines = fines;
	}

	@Override
	public String toString() {
		return "Borrows [borNumber=" + borNumber + ", readerId=" + readerId + ", docId=" + docId + ", copyId=" + copyId
				+ ", libId=" + libId + ", bTime=" + bTime + ", rTime=" + rTime + ", fines=" + fines + "]";
	}

}
