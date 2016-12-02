package com.example.stackoverflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebSecurity
@SpringBootApplication
public class StackoverflowQ40929943Application extends WebSecurityConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(StackoverflowQ40929943Application.class, args);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
					.antMatchers("/**").permitAll();
	}


}
