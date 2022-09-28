package com.cav.rest.user.bankuser.controllers;



import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cav.rest.user.bankuser.models.Account;
import com.cav.rest.user.bankuser.models.Account;

import java.util.Objects;
import java.util.Random;
import java.util.Set;


@RestController
@RequestMapping("/bank")
public class BankController {

	private static Logger log = LoggerFactory.getLogger(BankController.class);
	
	@PostMapping(value = "/account/")
	public Account generateAccount(@RequestBody Account account) {
		Random random = new Random(123456789);
		String accountId = account.getFname()+account.getSname()+random.nextInt();
		account.setAccountId(accountId);
		return account;
	}

	/*
	@GetMapping(value = "/accountHeaders/")
	public ResponseEntity<Account> getuser(@RequestHeader HttpHeaders headers) {
		log.info("USER2 "+name.toString());
		for(Entry<String, List<String>> entry : headers.entrySet()) {
			log.info("Key : "+entry.getKey());
			List<String> values = entry.getValue();
			for(String value : values) {
				log.info("value : "+value);
			}
		}
		List<String> list = headers.get("Number");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			log.info(iter.next());
		}
		Account user = new Account("Tony", "Cavanagh");
		return new ResponseEntity<Account>(user, HttpStatus.OK);
	}*/
	
	@GetMapping(value = "/throw/")
	public ResponseEntity<Account> throwExeception(@RequestHeader HttpHeaders headers) throws SocketTimeoutException {
		log.info("THROW RUN TIME OUT");
		Account user = new Account("Tony", "Cavanagh");
		throw new SocketTimeoutException("HTTP 504 Gateway Timeout");
	}

}
