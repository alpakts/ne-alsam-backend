package com.example.workshop.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("htmls/home");
		registry.addViewController("/").setViewName("htmls/home");
		registry.addViewController("/hello").setViewName("htmls/hello");
		registry.addViewController("/login").setViewName("htmls/login");
	}

}