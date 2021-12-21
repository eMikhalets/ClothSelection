package com.emikhalets.clothselection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ClothselectionApplication extends SpringBootServletInitializer {

    private static final Class<ClothselectionApplication> applicationClass = ClothselectionApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(ClothselectionApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(applicationClass);
    }
}