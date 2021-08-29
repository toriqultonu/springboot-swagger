package com.koshailimited.springbootswaggerdemo.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    
    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.koshailimited.springbootswaggerdemo"))
                .paths(regex("/rest.*"))
                .build()
                .apiInfo(metaInfo());
    }
    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
          "Spring boot swagger example api",
                "spring api for youtube",
                "1.0",
                "team of service",
                new Contact("eara", "google.com", "adf@gmail.com"),
                "licence",
                "google.com"
        );
                return apiInfo;
    }


}
