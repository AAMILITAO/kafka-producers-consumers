package com.github.aamilitao.apiproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ApiProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProducerApplication.class, args);
	}

}
