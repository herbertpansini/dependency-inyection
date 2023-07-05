package com.devs4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.devs4j.di.qualifiers.Animal;
import com.devs4j.di.qualifiers.Avion;
import com.devs4j.di.qualifiers.Nido;
import com.devs4j.di.qualifiers.Pajaro;
import com.devs4j.di.qualifiers.Perro;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		
		Perro perro = context.getBean(Perro.class);
		log.info("Objeto perro {}", perro.getNombre());
		
		Pajaro pajaro = context.getBean(Pajaro.class);
		log.info("Objeto pajaro {}", pajaro.getNombre());
		
		Avion avion = context.getBean(Avion.class);
		avion.volar();
		
		Animal animal = context.getBean("pajarito", Animal.class);
		log.info("Animal nombre = {}, edad = {}", animal.getNombre(), animal.getEdad());
		
		Nido nido = context.getBean(Nido.class);
		nido.imprimir();
	}
}
