package com.app.producer.event;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("ProducerBankEvent")
public class BankEvent {

    private String bankId;
    private String messageService;
    private String bankName;
}
