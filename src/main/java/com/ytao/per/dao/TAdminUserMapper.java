package com.ytao.per.dao;

import java.util.List;
import java.lang.Integer;
import org.apache.ibatis.annotations.Param;
import com.ytao.per.bean.TAdminUser;


public interface TAdminUserMapper {

	TAdminUser selectById(Integer id);
	
	Integer insert(TAdminUser param);
	
	Integer update(TAdminUser param);
	
	Integer selectCount(TAdminUser param);
	
	List<TAdminUser> selectByPage(@Param("param")TAdminUser param,@Param("offset")Integer offset,@Param("rows")Integer rows);
	
	Integer deleteById(Integer id);

	TAdminUser selectByUsername(@Param("username")String username);
}