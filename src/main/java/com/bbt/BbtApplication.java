package com.bbt;

import org.mybatis.spring.annotation.MapperScan;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
        import org.springframework.boot.builder.SpringApplicationBuilder;
        import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = {"com.bbt.generator"})
public class BbtApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BbtApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BbtApplication.class);
    }

}
