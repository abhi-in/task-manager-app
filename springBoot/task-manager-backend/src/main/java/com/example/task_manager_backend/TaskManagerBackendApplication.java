package com.example.task_manager_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class TaskManagerBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskManagerBackendApplication.class, args);
    }

    // CORS configuration
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Allow frontend from localhost:3000 to access backend
                registry.addMapping("/**").allowedOrigins("http://localhost:3000");
            }
        };
    }
}
