package assessment.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import assessment.beans.House;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public House house () {
		House bean = new House();
		return bean;
	}
}
