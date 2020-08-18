package com.igeekhome.springboot_qs_02;

import com.igeekhome.springboot_qs_02.pojo.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootQs02ApplicationTests {
    /**
     * 注入Spring容器
     */
    @Autowired
    private ApplicationContext ac;

    @Test
    public void contextLoads() {
        Employee employee = ac.getBean("employee", Employee.class);
        System.out.println(employee);
    }

}
