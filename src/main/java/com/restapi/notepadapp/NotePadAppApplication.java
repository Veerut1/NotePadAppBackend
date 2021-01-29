package com.restapi.notepadapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NotePadAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotePadAppApplication.class, args);
	}
	
	
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) { 
		  return applicationBuilder.sources(NotePadAppApplication.class); }
	 
}
