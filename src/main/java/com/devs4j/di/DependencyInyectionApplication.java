package com.devs4j.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.devs4j.di.atributo.Coche;
import com.devs4j.di.atributo.Motor;

@SpringBootApplication
public class DependencyInyectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		Coche coche = context.getBean(Coche.class);
		
//		Motor motor = new Motor("Xl1", 1981);
//		Coche coche = new Coche("VW", 1986, motor);
		
		System.out.println(coche);
	}

}
