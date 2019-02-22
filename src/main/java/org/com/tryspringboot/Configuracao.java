package org.com.tryspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//controller 
//@Controller

//classe de configuração do SpringBoot
@SpringBootApplication
public class Configuracao {

//	//mapeando uma url
//	@RequestMapping("/")
//	//retorna o corpo da body
//	@ResponseBody
//	String ola() {
//		return "<h1>Olá. Bem-vindo ao sistema Spring Boot</h1>";
//	}
	
	public static void main(String[] args) {		
		SpringApplication.run(Configuracao.class, args);
		
	}
	
//	@Bean
//	public DataSource dataSource(){
//	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//	    dataSource.setUrl("jdbc:mysql://localhost:3306/listavip");	    
//	    dataSource.setUsername("root");
//	    dataSource.setPassword("root");
//	    return dataSource;
//	}
	
	

}
