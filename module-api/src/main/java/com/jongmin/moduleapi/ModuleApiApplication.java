package com.jongmin.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (
		scanBasePackages = {"com.jongmin.moduleapi", "com.jongmin.modulecommon"}
)
@EntityScan("com.jongmin.modulecommon.domain")
@EnableJpaRepositories(basePackages = "com.jongmin.modulecommon.repository")
public class ModuleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleApiApplication.class, args);
	}

}
