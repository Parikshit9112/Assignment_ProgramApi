package com.programs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeHttpRequests(authorize -> {
        	authorize.requestMatchers("/api/programs/**").authenticated()
            .anyRequest().permitAll();
           
        });
	  //  httpSecurity.formLogin(Customizer.withDefaults());
       // httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        
        httpSecurity.csrf(AbstractHttpConfigurer::disable);
        return httpSecurity.build();
	}
}
