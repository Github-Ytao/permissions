package com.ytao.per.dao;

import java.util.List;
import java.lang.Integer;

import com.ytao.per.bean.TAdminAuth;
import org.apache.ibatis.annotations.Param;
import com.ytao.per.bean.TRoleAuth;


public interface TRoleAuthMapper {

	TRoleAuth selectById(Integer id);
	
	Integer insert(TRoleAuth param);
	
	Integer update(TRoleAuth param);
	
	Integer selectCount(TRoleAuth param);
	
	List<TRoleAuth> selectByPage(@Param("param")TRoleAuth param,@Param("offset")Integer offset,@Param("rows")Integer rows);
	
	Integer deleteById(String id);

	Integer deleteRoleAuthByRoleId(String roleId);


}