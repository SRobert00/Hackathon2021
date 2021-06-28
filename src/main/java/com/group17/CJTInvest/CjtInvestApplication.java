package com.group17.CJTInvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@PropertySource("classpath:/application.properties")
@EnableCaching
@EnableSwagger2
@SpringBootApplication
public class CjtInvestApplication {

    private static final String RESOURCE_BUNDLE_NAME = "resourceMessages";

    public static void main(String[] args) {
        SpringApplication.run(CjtInvestApplication.class, args);
    }
}