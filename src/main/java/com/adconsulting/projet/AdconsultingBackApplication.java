package com.adconsulting.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Arrays;
import java.util.Collections;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import java.sql.*;


import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;




import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;



@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class AdconsultingBackApplication {

	

	
	public static void main(String[] args) {
		SpringApplication.run(AdconsultingBackApplication.class, args);
		
	}

	
	@Bean 
	public CorsConfigurationSource corsConfigurationSource() {
		  CorsConfiguration configuration = new CorsConfiguration();
		  configuration.setAllowedOrigins(Collections.singletonList(
		  "https://ad-consultingg.herokuapp.com/"));
		  configuration.setAllowedMethods(Arrays.asList("GET","POST", "PUT", "DELETE",
		  "PATCH", "OPTIONS"));
		  configuration.setExposedHeaders(Arrays.asList("Authorization",
		  "content-type"));
		  configuration.setAllowedHeaders(Arrays.asList("Authorization",
		  "content-type")); UrlBasedCorsConfigurationSource source = new
		  UrlBasedCorsConfigurationSource(); source.registerCorsConfiguration("/**",
		  configuration); 
		  
		  return source;
		  
		  }
	

}
