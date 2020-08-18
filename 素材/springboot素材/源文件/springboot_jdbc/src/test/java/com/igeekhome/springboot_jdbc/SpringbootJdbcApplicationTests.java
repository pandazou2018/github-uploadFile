package com.igeekhome.springboot_jdbc;

import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJdbcApplicationTests {


    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {
        System.out.println("获取连接之前==dataSource===>"+dataSource);
        try {
            Connection connection = dataSource.getConnection();

            //执行SQL语句....
            System.out.println("连接对象===>"+connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("获取连接之后==dataSource===>"+dataSource);

    }

}
