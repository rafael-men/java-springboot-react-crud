package com.rafacrud.fullstackbackend.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;


@OpenAPIDefinition(info = @Info(title = "BackEnd of the Fullstack CRUD Java Project",version = "v0.0.1",description = "Documentation of this api" ))
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .components(new Components())
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("BackEnd of the Fullstack CRUD Java Project")
                        .version("v0.0.1")
                        .description("Documentation of this api."));
    }
}