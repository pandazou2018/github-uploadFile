package com.igeekhome.springboot_mybatis.mapper;

import com.igeekhome.springboot_mybatis.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Administrator
 * @create 2019/06/04
 */
//@Mapper  //声明当前接口是一个Mapper接口
public interface UserMapper {
    //@Select("select id,username,phone,email,created,updated from tb_user")
    public List<User> list();

    //@Insert("insert into tb_user(username,password,phone,email,created,updated) values(#{username},#{password},#{phone},#{email},#{created},#{updated})")
    public boolean add(User user);

    //@Update("update tb_user set username=#{username},password=#{password},phone=#{phone},email=#{email},created=#{created},updated=#{updated} where id = #{id}")
    public boolean update(User user);

    //@Delete("delete from tb_user where id = #{id}")
    public boolean delete(Long id);
}
