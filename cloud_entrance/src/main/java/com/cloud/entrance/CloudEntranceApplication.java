package com.cloud.entrance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cloud")
public class CloudEntranceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudEntranceApplication.class, args);
    }

}
