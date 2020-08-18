package com.igeekhome.springboot_qs.configuration;

import com.igeekhome.springboot_qs.servcie.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration
 * 配置类=>等价于之前的配置文件
 * <beans>
 *    	<bean id="userService" class="xxx.xxx.xxx.UserService"></bean>
 *        ...
 * </beans>
 * @author Administrator
 * @create 2019/06/03
 */
@Configuration
public class MyConfiguration {

    /*等价于：<bean id="userService" class="xxx.xxx.xxx.UserService"></bean>
    * @Bean：相当于配置了一个bean节点
    * 方法的返回值=>bean的class
    * 方法的方法名=>bean的id
    * */
    @Bean
    public UserService userService(){
        return new UserService();
    }
}
