package com.example.swagger.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableAutoConfiguration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        // 如果需要token，可加如下配置
//        ParameterBuilder token = new ParameterBuilder();
//        List<Parameter> pars = new ArrayList<>();
//        token.name("token_id").description("user token")
//                .modelRef(new ModelRef("string")).parameterType("header")
//                .required(false).build();
//        pars.add(token.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 指定controller存放的目录路径
                .apis(RequestHandlerSelectors.basePackage("com.example.swagger"))
                .paths(PathSelectors.any())
                .build();
//                .globalOperationParameters(pars);
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                // 文档标题
                .title("swagger正式初学")
                // 文档描述
                .description("swagger在线api描述")
                .termsOfServiceUrl("需求文档wiki地址")
                .version("v1")
                .build();
    }

}
