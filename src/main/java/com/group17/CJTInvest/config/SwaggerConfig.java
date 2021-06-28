package com.group17.CJTInvest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerDefaultDocumentation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/cjtinvest/**"))
                .build()
                .apiInfo(apiInfo("CJTInvest", "CJTInvest application", "v1.0"));
    }

    private ApiInfo apiInfo(String apiTitle, String apiDescription, String apiVersion) {
        return new ApiInfoBuilder()
                .title(apiTitle)
                .description(apiDescription)
                .version(apiVersion)
                .termsOfServiceUrl("Terms of service")
                .build();
    }
}