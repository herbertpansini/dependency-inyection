package com.devs4j.di.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Nido {
	private static final Logger log = LoggerFactory.getLogger(Nido.class);
	
	@Autowired
	private Animal animal; 
	
	public void imprimir() {
		log.info("Mi nido tiene al animal {} ", animal.getNombre());
	}
}
