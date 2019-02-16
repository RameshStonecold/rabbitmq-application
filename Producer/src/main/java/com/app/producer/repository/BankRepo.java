package com.app.producer.repository;

import com.app.producer.event.BankEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankRepo extends MongoRepository<BankEvent, String> {
}
