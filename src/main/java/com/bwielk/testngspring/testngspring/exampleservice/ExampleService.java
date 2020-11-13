package com.bwielk.testngspring.testngspring.exampleservice;

import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class ExampleService {

    public ExampleService() {
        System.out.println("Object created");
    }

    public String generateName(){
        return "RobotName" + UUID.randomUUID().toString();
    }
}
