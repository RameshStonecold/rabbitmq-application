package com.app.consumer.repository;

import com.app.consumer.model.ConsumerPersist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsumerRepo extends MongoRepository<ConsumerPersist,String> {
}
