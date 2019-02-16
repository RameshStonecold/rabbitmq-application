package com.app.producer.event;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class BankServicePublisher {

    @Autowired
    private BankServiceSource bankServiceSource;

    public void sendMessage(BankEvent bankEvent){

        bankServiceSource.publicMessage().send(MessageBuilder.withPayload(bankEvent).build());


    }
}
