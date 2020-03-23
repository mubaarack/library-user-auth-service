package com.teal.library.springsecurityjwt.models;

public class Branch {

	private int libId;
	private String lName;
	private String lLocation;

	public Branch() {
	}

	public Branch(int libId, String lName, String lLocation) {
		this.libId = libId;
		this.lName = lName;
		this.lLocation = lLocation;
	}

	public int getLibId() {
		return libId;
	}

	public void setLibId(int libId) {
		this.libId = libId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getlLocation() {
		return lLocation;
	}

	public void setlLocation(String lLocation) {
		this.lLocation = lLocation;
	}

	@Override
	public String toString() {
		return "Branch [libId=" + libId + ", lName=" + lName + ", lLocation=" + lLocation + "]";
	}

}
