package com.example.EmployeeLogger;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

@Configuration
@EnableWebSecurity
public class SpringBootBasicauthSecurity extends WebSecurityConfigurerAdapter {
	
	
/*	protected void configure(HttpSecurity http) throws Exception {
		
		
		//authorizeRequests((requests) -> requests.anyRequest().authenticated())
		//http.formLogin();
	
		
		  /*csrf().disable()
		  .authorizeRequests()
		  .antMatchers(HttpMethod.OPTIONS,"/**")
		  .permitAll()
		  .anyRequest().authenticated()
		  .and()*/
		
	/*	 http.
         // your security config here
         authorizeRequests()
         .antMatchers(HttpMethod.OPTIONS,"/**").authenticated()
         .anyRequest().permitAll()
         .and().httpBasic()
         .and().headers().frameOptions().disable()
         .and().csrf().disable()
         .headers()
		 
      
        // the headers you want here. This solved all my CORS problems! 
        .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Origin", "*"))
        .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Methods", "POST, GET"))
        .addHeaderWriter(new StaticHeadersWriter("Access-Control-Max-Age", "3600"))
        .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Credentials", "true"))
        .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Headers", "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization"));


	}*/

//.csrf() .disable() .cors() .and() ?

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.cors()
		.and()
		.authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
				.anyRequest().authenticated()
				.and()
			//.formLogin().and()
			.httpBasic();
	}






}
