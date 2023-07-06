package com.devs4j.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class LifeCycleBean implements BeanNameAware {
	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	@Override
	public void setBeanName(String name) {
		log.info("Bean name aware {}", name);
	}
	
	/*
	 * Se ejecutara despues de la inyeccion de dependencias
	 */
	@PostConstruct
	public void init() {
		log.info("Post Construct");
	}
	
	/*
	 * Se ejecutara antes de que el bean sea destruido
	 * No se ejecutan para beans prototype
	 * Solo se ejecutan durante una terminacion del la VM de forma normal
	 */
	@PreDestroy
	public void destroy() {
		log.info("Pre Destroy");
	}
}