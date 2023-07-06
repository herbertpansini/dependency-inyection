package com.devs4j.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.devs4j.di.lifecycle.LifeCycleBean;

@SpringBootApplication
public class DependencyInyectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		
		context.getBean(LifeCycleBean.class);
	}
}
