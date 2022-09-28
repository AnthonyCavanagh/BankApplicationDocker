package com.cav.rest.user.bankuser.models;

public class Transaction {

	private String accountId;
	private String transaction;
	private String amount;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(String accountId, String transaction, String amount) {
		super();
		this.accountId = accountId;
		this.transaction = transaction;
		this.amount = amount;
	}

	public String getAccountId() {
		return accountId;
	}

	public String getTransaction() {
		return transaction;
	}

	public String getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Transaction [accountId=" + accountId + ", transaction=" + transaction + ", amount=" + amount + "]";
	}

}
