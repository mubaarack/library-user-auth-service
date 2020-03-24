package com.teal.library.springsecurityjwt.models;

public class Copy {

	private int docId;
	private String copyId;
	private int libId;
	private String position;

	public Copy() {
	}

	public Copy(int docId, String copyId, int libId, String position) {
		this.docId = docId;
		this.copyId = copyId;
		this.libId = libId;
		this.position = position;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Copy [docId=" + docId + ", copyId=" + copyId + ", libId=" + libId + ", position=" + position + "]";
	}

}
