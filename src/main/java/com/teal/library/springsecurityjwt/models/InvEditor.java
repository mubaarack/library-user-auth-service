package com.teal.library.springsecurityjwt.models;

public class InvEditor {
	private int docId;
	private int issue_No;
	private String ieName;
	
	public InvEditor(int docId, int issue_No, String ieName) {
		super();
		this.docId = docId;
		this.issue_No = issue_No;
		this.ieName = ieName;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public int getIssue_No() {
		return issue_No;
	}
	public void setIssue_No(int issue_No) {
		this.issue_No = issue_No;
	}
	public String getIeName() {
		return ieName;
	}
	public void setIeName(String ieName) {
		this.ieName = ieName;
	}
	@Override
	public String toString() {
		return "InvEditor [docId=" + docId + ", issue_No=" + issue_No + ", ieName=" + ieName + "]";
	}
	

}
