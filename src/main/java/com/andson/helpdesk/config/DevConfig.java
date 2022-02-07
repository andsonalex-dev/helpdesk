package com.andson.helpdesk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andson.helpdesk.services.DBService;

@Configuration
@Profile("dev")
public class DevConfig {
/**
 * Classe de dev com a anotação de configuração e profile de teste
 * 
 *
 */
	
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;
	
	@Bean 
	public boolean instanciaDB() {
		if(value.equals("create")) {
			//Toda vez que chamar o método test ele vai subir a instancias
			this.dbService.instanciaDB();
		}
	return false;			
	}
}
