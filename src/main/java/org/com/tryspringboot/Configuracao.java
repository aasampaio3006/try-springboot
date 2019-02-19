package org.com.tryspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//classe de configuração do SpringBoot
@SpringBootApplication

//controller 
@Controller
public class Configuracao {

	//mapeando uma url
	@RequestMapping("/")
	//retorna o corpo da body
	@ResponseBody
	String ola() {
		return "<h1>Olá. Bem-vindo ao sistema Spring Boot</h1>";
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(Configuracao.class, args);
		
	}
	
	

}
