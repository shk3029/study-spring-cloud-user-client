package com.example.studyclouduserservice.vo;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
public class Greeting {

    @Value("${greeting.message}")
    private String message;


}
