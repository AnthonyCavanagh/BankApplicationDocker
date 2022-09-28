package com.cav.rest.user.bankuser.models;

import java.util.ArrayList;
import java.util.List;


public class Transactions {

	private List <Transaction> transactions = new ArrayList<Transaction> ();

	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
