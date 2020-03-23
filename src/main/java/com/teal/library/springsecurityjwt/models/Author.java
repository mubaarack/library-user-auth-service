package com.teal.library.springsecurityjwt.models;

public class Author {

	public Author() {
	}

	public Author(int authorId, String aname) {
		this.authorId = authorId;
		this.aname = aname;
	}

	private int authorId;
	private String aname;

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", aname=" + aname + "]";
	}

}
