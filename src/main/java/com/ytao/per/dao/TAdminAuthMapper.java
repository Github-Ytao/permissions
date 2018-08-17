package com.ytao.per.dao;

import java.util.List;
import java.lang.Integer;
import org.apache.ibatis.annotations.Param;
import com.ytao.per.bean.TAdminAuth;


public interface TAdminAuthMapper {

	TAdminAuth selectById(String id);
	
	Integer insert(TAdminAuth param);
	
	Integer update(TAdminAuth param);
	
	Integer selectCount(TAdminAuth param);
	
	List<TAdminAuth> selectByPage(@Param("param")TAdminAuth param,@Param("offset")Integer offset,@Param("rows")Integer rows);
	
	Integer deleteById(String id);

	List<TAdminAuth> listUserAuth(@Param("userId") String userId);

}