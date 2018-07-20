package com.hongghe.patternexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The start up class.
 *
 * @author hongghe 07/2018
 */
@SpringBootApplication
public class PatternExampleApplication {

	@Bean
	public PatternExampleProperties patternExampleProperties() {
		return new PatternExampleProperties();
	}

	@Bean
	public PatternExampleInitializer patternExampleInitializer() {
		return new PatternExampleInitializer();
	}

	@Bean
	public PatternExampleWebConfig patternExampleWebConfig() {
		return new PatternExampleWebConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(PatternExampleApplication.class, args);
	}
}
