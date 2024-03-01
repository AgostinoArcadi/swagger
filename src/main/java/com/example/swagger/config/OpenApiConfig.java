package com.example.swagger.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    //http://localhost:8080/swagger-ui/index.html
    @Bean
    public OpenAPI myOpenApi() {

        Contact contact = new Contact();
        contact.setEmail("agostino@gmail.com");
        contact.setName("Agostino");
        contact.setUrl("https://google.com");

        License agoLicense = new License().name("AGO License").url("https://google.com");

        Info info = new Info()
                .title("Nomi")
                .version("1.0")
                .contact(contact)
                .description("Questa Api espone le endpoint dei nomi")
                .termsOfService("https://google.com")
                .license(agoLicense);

        return new OpenAPI().info(info);
    }
}
