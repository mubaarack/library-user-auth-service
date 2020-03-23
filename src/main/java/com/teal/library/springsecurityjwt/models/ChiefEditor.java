package com.teal.library.springsecurityjwt.models;

public class ChiefEditor {

	private int editorId;
	private String eName;

	public ChiefEditor() {
	}

	public ChiefEditor(int id, String eName) {
		this.editorId = id;
		this.eName = eName;
	}

	public int getId() {
		return editorId;
	}

	public void setId(int id) {
		this.editorId = id;
	}

	public String getlName() {
		return eName;
	}

	public void setlName(String lName) {
		this.eName = lName;
	}

	@Override
	public String toString() {
		return "ChiefEditor [editorId=" + editorId + ", eName=" + eName + "]";
	}

}
