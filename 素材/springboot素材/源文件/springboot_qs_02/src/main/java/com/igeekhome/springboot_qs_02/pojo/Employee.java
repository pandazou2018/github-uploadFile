package com.igeekhome.springboot_qs_02.pojo;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Arrays;

/**
 * @author Administrator
 * @create 2019/06/03
 *
 * 如果需要使用@ConfigurationProperties 那么前提是：当前对象必须是spring容器中的组件
 *
 * @ConfigurationProperties:将配置文件中的配置属性与对象中的属性进行关联
 * prefix:指定将配置文件中的哪个配置进行关联
 *
 * @PropertySource:指定从哪个外部文件中加载配置
 */
@Component
@PropertySource(value = "classpath:employee.properties")
@ConfigurationProperties(prefix = "employee01")
//@Validated //开启数据校验功能
public class Employee {

    /*
    * @Value("字面量、${配置文件中、系统变量属性值}、#{spEL表达式}")
    * */
    //@Email
    //@Value("${employee01.username}")
    private String username;
    //@Value("#{10+20}")
    private Integer age;
    private Dept dept;
    private String[] subjects;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", dept=" + dept +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
