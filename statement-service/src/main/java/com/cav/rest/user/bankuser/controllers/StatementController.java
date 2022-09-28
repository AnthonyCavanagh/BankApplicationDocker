package com.cav.rest.user.bankuser.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.cav.rest.user.bankuser.models.Transactions;
import reactor.core.publisher.Mono;
import com.cav.rest.user.bankuser.models.Account;


@RestController
@RequestMapping("/bank")
public class StatementController {

	private static Logger log = LoggerFactory.getLogger(StatementController.class);

	@Autowired
	WebClient.Builder webClientBuilder;

	@GetMapping(value = "/allstatements/")
	public Transactions getAllTransactions() {
		Mono<Transactions> transactions = webClientBuilder.build().get().uri("http://TRANSACTION-SERVICE/bank/alltransactions/").retrieve().bodyToMono(Transactions.class);
		Transactions trans = transactions.block();
		return trans;
	}

}
