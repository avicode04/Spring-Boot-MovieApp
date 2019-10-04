package com.stackroute.Movie.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.h2.server.web.WebServlet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class AppConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stackroute.Movie.controller"))
                .paths(regex("/api.*"))
                .build();
    }



//    ServletRegistrationBean h2servlet(){
//        ServletRegistrationBean registrationBean= new ServletRegistrationBean(new WebServlet());
//        registrationBean.addUrlMappings("/console/*");
//        return registrationBean;
//    }
}
