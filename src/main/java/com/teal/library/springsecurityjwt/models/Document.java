package com.teal.library.springsecurityjwt.models;

public class Document {

	private int docId;
	private String title;
	private String date;
	private int publisherId;

	public Document() {
	}

	public Document(int docId, String title, String date, int publisherId) {
		this.docId = docId;
		this.title = title;
		this.date = date;
		this.publisherId = publisherId;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	@Override
	public String toString() {
		return "Document [docId=" + docId + ", title=" + title + ", date=" + date + ", publisherId=" + publisherId
				+ "]";
	}

}
