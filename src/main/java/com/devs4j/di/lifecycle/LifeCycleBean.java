package com.devs4j.di.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope("prototype") -- Recordemos que PreDestroy no se ejecuta para beans de tipo prototype
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {
	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	/*
	 * Se ejecuta durante la construccion del bean "BeanNameAware"
	 */
	@Override
	public void setBeanName(String name) {
		log.info("Bean name aware {}", name);
	}
	
	/*
	 * Se ejecutara despues de la inyeccion de dependencias
	 */
	@PostConstruct
	public void initBean() {
		log.info("Post Construct");
	}
	
	/*
	 * Se ejecutara antes de que el bean sea destruido
	 * No se ejecutan para beans prototype
	 * Solo se ejecutan durante una terminacion del la VM de forma normal
	 */
	@PreDestroy
	public void destroyBean() {
		log.info("Pre Destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("After properties set method");
	}
	
	@Override
	public void destroy() throws Exception {
		log.info("Destroy method");
	}
}