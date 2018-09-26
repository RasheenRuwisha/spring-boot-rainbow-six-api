package com.infinium.rasheen.rainbowopapi;

import com.infinium.rasheen.rainbowopapi.util.CORSFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.logging.Filter;


@SpringBootApplication

public class RainbowOpApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(RainbowOpApiApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean corsFilterRegistration(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new CORSFilter());
		filterRegistrationBean.setName("CORS Filter");
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.setOrder(1);
		return filterRegistrationBean;
	}

}





