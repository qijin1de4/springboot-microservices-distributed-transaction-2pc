package io.learning.transaction;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class StartTransactionServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartTransactionServerApplication.class, args);
    }

    @Bean
    public TopicExchange topic() {
        return new TopicExchange("txn-events");
    }
}
