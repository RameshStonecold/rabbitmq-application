package com.app.producer.controller;

import com.app.producer.event.BankEvent;
import com.app.producer.event.BankServicePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.producer.repository.BankRepo;

@RestController
public class BankController {

    @Autowired
    private BankServicePublisher bankServicePublisher;

    @Autowired
    private BankRepo bankRepo;

    @PostMapping("/saveEvent")
    public String saveEvent(@RequestBody BankEvent bankEvent){

        bankServicePublisher.sendMessage(bankEvent);
        bankRepo.save(bankEvent);

        return "Message published and persisted in db";
    }
}
