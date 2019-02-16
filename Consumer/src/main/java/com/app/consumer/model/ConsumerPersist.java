package com.app.consumer.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class ConsumerPersist {


    private String bankId;
    private String messageService;
    private String bankName;

}
