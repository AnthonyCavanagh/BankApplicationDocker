package com.cav.rest.user.bankuser.models;

public class Account {

	String fname;
	String sname;
	String accountId;
	public Account(String fname, String sname) {
		super();
		this.fname = fname;
		this.sname = sname;
	}
	public String getFname() {
		return fname;
	}
	public String getSname() {
		return sname;
	}

	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", sname=" + sname + "]";
	}
}
