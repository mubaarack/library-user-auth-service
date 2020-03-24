package com.teal.library.springsecurityjwt.models;

public class Writes {
	private int authorId;
	private int docId;
	public Writes(int authorId, int docId) {
		super();
		this.authorId = authorId;
		this.docId = docId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	@Override
	public String toString() {
		return "Writes [authorId=" + authorId + ", docId=" + docId + "]";
	}
	

}
