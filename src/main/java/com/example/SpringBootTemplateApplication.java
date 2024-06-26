package com.example;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(info = @Info(title = "Springboot Template Service", version = "1.0", description = "Documentation APIs v1.0"))
public class SpringBootTemplateApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootTemplateApplication.class, args);
  }
}
