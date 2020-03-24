package com.teal.library.springsecurityjwt.models;

public class JournalIssue {
	private int docId;
	private int issueNo;
	private String scope;
	
	public JournalIssue(int docId, int issueNo, String scope) {
		super();
		this.docId = docId;
		this.issueNo = issueNo;
		this.scope = scope;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public int getIssueNo() {
		return issueNo;
	}
	public void setIssueNo(int issueNo) {
		this.issueNo = issueNo;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	@Override
	public String toString() {
		return "JournalIssue [docId=" + docId + ", issueNo=" + issueNo + ", scope=" + scope + "]";
	}
	
	

}
