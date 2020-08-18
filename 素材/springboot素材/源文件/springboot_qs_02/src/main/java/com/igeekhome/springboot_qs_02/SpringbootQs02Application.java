package com.igeekhome.springboot_qs_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
/*@ImportResource 加载spring配置文件*/
@ImportResource(locations = {"classpath:applicationContext.xml"})
public class SpringbootQs02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQs02Application.class, args);
    }

}
