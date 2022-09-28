package com.cav.rest.user.bankuser.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cav.rest.user.bankuser.models.Transaction;
import com.cav.rest.user.bankuser.models.Transactions;
import com.cav.rest.user.bankuser.repositories.TransactionsRepositories;


@RestController
@RequestMapping("/bank")
public class TransactionController {
	

	@Autowired
	TransactionsRepositories transactionsRepositories;

	private static Logger log = LoggerFactory.getLogger(TransactionController.class);
	
	@GetMapping(value = "/transactionshealth/")
	public String getHealth() {
		return "Transaction UP";
	}
	
	@GetMapping(value = "/alltransactions/")
	public Transactions getAllTransactions() {
		List<Transaction> transactionList = transactionsRepositories.findAll();
		Transactions transactions = new Transactions();
		transactions.setTransactions(transactionList);
		return transactions;
	}

	
	@PostMapping(value = "/transactions/")
	public Transactions generateAccount(@RequestBody Transactions transactions) {
		for(Transaction transaction : transactions.getTransactions()) {
			transactionsRepositories.save(transaction);
		}
		return transactions;
	}


}
