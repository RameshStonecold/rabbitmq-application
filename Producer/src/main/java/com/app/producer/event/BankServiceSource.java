package com.app.producer.event;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface BankServiceSource {

    @Output(OUTPUT)
    MessageChannel publicMessage();

    String OUTPUT="bankServiceChannel";
}
