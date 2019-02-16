package com.app.consumer.listener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;


@Component
public interface ConsumerInputStream {

    @Input(INPUT)
    SubscribableChannel subscribe();

        String INPUT="message-in";


}
