package com.app.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.app.user.model.UserVO;

@Mapper
public interface UserMapper {

	@Select("select * from user where id=#{id}")
	UserVO getUser(@Param("id") String id);
	
	@Select("select * from user")
	List<UserVO> getUserList();
	
	@Insert("insert into user values (#{user.id},#{user.name},#{user.phone},#{user.address})")
	int insertUser(@Param("user") UserVO user);
	
	@Update("update user set (name=#{user.name},phone=#{user.phone},address=#{user.address}) where id=#{user.id}")
	int updateUser(@Param("user") UserVO user);
	
	@Delete("delete from user where id=#{id}")
	int deleteUser(@Param("id") String id);
	
}
