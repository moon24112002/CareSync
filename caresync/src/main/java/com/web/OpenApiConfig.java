package com.web;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPI()
//                .info(new Info().title("My API")
//                .description("API documentation for My Spring Boot Application")
//                .version("1.0")
//                .contact(new Contact().name("Your Name").email("your.email@example.com")));
//    }
//
//    @Bean
//    public GroupedOpenApi publicApi() {
//        return GroupedOpenApi.builder()
//                .group("public")
//                .pathsToMatch("/**")
//                .build();
//    }
}
