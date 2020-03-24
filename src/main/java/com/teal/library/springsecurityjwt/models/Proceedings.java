package com.teal.library.springsecurityjwt.models;

import java.sql.Date;

public class Proceedings {
	private int docId;
	private Date cDate;
	private String cLocation;
	private String cEditor;
	public Proceedings(int docId, Date cDate, String cLocation, String cEditor) {
		super();
		this.docId = docId;
		this.cDate = cDate;
		this.cLocation = cLocation;
		this.cEditor = cEditor;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public Date getcDate() {
		return cDate;
	}
	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	public String getcLocation() {
		return cLocation;
	}
	public void setcLocation(String cLocation) {
		this.cLocation = cLocation;
	}
	public String getcEditor() {
		return cEditor;
	}
	public void setcEditor(String cEditor) {
		this.cEditor = cEditor;
	}
	@Override
	public String toString() {
		return "Proceedings [docId=" + docId + ", cDate=" + cDate + ", cLocation=" + cLocation + ", cEditor=" + cEditor
				+ "]";
	}
	

}
