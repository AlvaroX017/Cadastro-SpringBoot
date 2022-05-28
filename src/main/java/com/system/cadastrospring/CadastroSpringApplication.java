package com.system.cadastrospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CadastroSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroSpringApplication.class, args);
	}

}
