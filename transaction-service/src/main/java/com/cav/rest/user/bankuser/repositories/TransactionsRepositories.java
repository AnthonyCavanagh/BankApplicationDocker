package com.cav.rest.user.bankuser.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cav.rest.user.bankuser.models.Transaction;

public interface TransactionsRepositories extends MongoRepository<Transaction, String>{

}
