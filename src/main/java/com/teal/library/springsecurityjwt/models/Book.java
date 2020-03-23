package com.teal.library.springsecurityjwt.models;

public class Book {

	private int docId;
	private String ISBN;

	public Book() {
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Book(int docId, String iSBN) {
		this.docId = docId;
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "Book [docId=" + docId + ", ISBN=" + ISBN + "]";
	}

}
