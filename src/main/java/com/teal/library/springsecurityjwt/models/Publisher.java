package com.teal.library.springsecurityjwt.models;

public class Publisher {
	private int publisherId;
	private String pubName;
	private String address;
	public Publisher(int publisherId, String pubName, String address) {
		super();
		this.publisherId = publisherId;
		this.pubName = pubName;
		this.address = address;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", pubName=" + pubName + ", address=" + address + "]";
	}
	

}
