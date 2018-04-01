package com.example.demo;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class h2Config {
	@Bean
	public ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean reg = new ServletRegistrationBean(new WebServlet());
		reg.addUrlMappings("/console/*");
		return reg;
		
	}
}
