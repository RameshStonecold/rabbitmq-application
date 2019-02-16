package com.app.consumer.listener;

import com.app.consumer.model.ConsumerPersist;
import com.app.consumer.repository.ConsumerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceListener {

    @Autowired
    ConsumerRepo consumerRepo;

@Autowired
 ConsumerInputStream consumerInputStream;

    @StreamListener(ConsumerInputStream.INPUT)
    public void listener(@Payload ConsumerPersist consumerPersist)
    {
        consumerRepo.save(consumerPersist);
    }
}
