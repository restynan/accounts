package com.ebankingapp.ugdevs.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket swaggerApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.ebankingapp.ugdevs.account.controller"))
                .build();
    }

      /* private ApiInfo apiDetails() {


        return new ApiInfo(" REST API",
                "This is a REST API for Account",
                "1.0",
                "API Terms of Service URL",
                new Contact("Progressive Coder", "www.progressivecoder.com", "coder.progressive@gmail.com"),
                "API License",
                "API License URL",
                Collections.emptyList()
        );
      return new ApiInfoBuilder().title("MIU Enrollment Management REST API")
                .description("Rest Api")
                .contact(new Contact("Ether", "___", "aabdullozoda@miu.edu"))
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0.0")
                .build();
    }*/
    }

