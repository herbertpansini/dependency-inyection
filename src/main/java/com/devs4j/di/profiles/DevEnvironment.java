package com.devs4j.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default"})
public class DevEnvironment implements EnvironmentService {

	@Override
	public String getEnvironment() {
		return "DEV";
	}

}
