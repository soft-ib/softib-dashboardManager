package com.softib.dashboardmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class DashboardManagerApplication {

	

public static void main(String[] args) {
	SpringApplication.run(DashboardManagerApplication.class, args);
}
	
@Bean
public Docket swaggerConfiguration() {
	return new Docket(DocumentationType.SWAGGER_2)
			  .apiInfo(apiInfo())
			  .securityContexts(Arrays.asList(securityContext()))
			  .securitySchemes(Arrays.asList(apiKey()))
			.select()
			.paths(PathSelectors.ant("/**"))
			.apis(RequestHandlerSelectors.basePackage("com.softib.dashboardmanager"))
		
			.build();
}

private ApiKey apiKey() { 
	return new ApiKey("JWT", "Authorization", "header"); 
}
private SecurityContext securityContext() { 
	return SecurityContext.builder().securityReferences(defaultAuth()).build(); 
} 

private List<SecurityReference> defaultAuth() { 
	AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything"); 
	AuthorizationScope[] authorizationScopes = new AuthorizationScope[1]; 
	authorizationScopes[0] = authorizationScope; 
	return Arrays.asList(new SecurityReference("JWT", authorizationScopes)); 
}
private ApiInfo apiInfo() {
	return new ApiInfo(
	  "REST API",
	  "Soft IB Core API.",
	  "1.0",
	  "Terms of service",
	  new Contact("Dhia saadlaui", "https://github.com/dhiasaadlaui/softib", "dhiasaadlaui@gmail.com"),
	  "License of API",
	  "API license URL",
	  Collections.emptyList());
}
}

