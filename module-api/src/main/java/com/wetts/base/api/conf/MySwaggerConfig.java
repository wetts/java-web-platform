package com.wetts.base.api.conf;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by wetts on 2017/4/5.
 */
// 让Spring来加载该类配置，Spring Boot用下配置
//@Configuration
@EnableWebMvc //NOTE: Only needed in a non-springboot application
@EnableSwagger2
public class MySwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.wetts.restful.controller")) // 设置扫描路径
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)) // 设置扫描方法包含的注解
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringMVC 中使用Swagger2构建RESTful APIs")
                .description("SpringMVC 中使用Swagger2构建RESTful APIs")
                .termsOfServiceUrl("https://wetts.github.io/")
                .contact(new Contact("wetts", "https://wetts.github.io/", "zhang.wetts@163.com"))
                .version("1.0")
                .build();
    }
}