package com.andson.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andson.helpdesk.services.DBService;

@Configuration
@Profile("test")
public class TesteConfig {
/**
 * Classe de testes com a anotação de configuração e profile de teste
 * 
 *
 */
	
	@Autowired
	private DBService dbService;
	
	@Bean //para acontecer de maneira automatica, tem q ter a anotação bean
	public void instanciaDB() {
		//Toda vez que chamar o método test ele vai subir a instancias
		this.dbService.instanciaDB();
		
	}
}
