package com.avik.cloud.stream.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
//tell Spring that this is the producer
@EnableBinding(Source.class)
public class SpringCloudStreamProducer {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamProducer.class, args);
	}

}
