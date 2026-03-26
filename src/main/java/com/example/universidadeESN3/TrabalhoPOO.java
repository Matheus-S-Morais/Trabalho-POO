package com.example.universidadeESN3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TrabalhoPOO {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoPOO.class, args);
	}

}
