package com.igeekhome.springboot_qs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 * @create 2019/06/03
 */

/**
 * @SpringBootApplication 声明该类是一个SpringBoot主程序类，启动SpringBoot应用，只需要执行主程序类main方法即可
 */
@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        //启动SpringBoot应用
        SpringApplication.run(MySpringBootApplication.class,args);
    }
}
