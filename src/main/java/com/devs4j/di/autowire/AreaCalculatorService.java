package com.devs4j.di.autowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaCalculatorService {
	
	@Autowired
	private List<Figure> figures;
	
	
	public double calcAreas() {
		return figures.stream().mapToDouble(f->f.calculateArea()).sum();
	}
}
