package com.project.periodicTable.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // allow all paths to be accessed
                .allowedOrigins("http://localhost:3000")  // allow access from this origin on frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE");//all methods allowed
    }
}

