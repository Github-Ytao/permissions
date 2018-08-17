package com.ytao.per.dao;

import java.util.List;
import java.lang.Integer;
import org.apache.ibatis.annotations.Param;
import com.ytao.per.bean.TAdminRole;


public interface TAdminRoleMapper {

	TAdminRole selectById(String id);
	
	Integer insert(TAdminRole param);
	
	Integer update(TAdminRole param);
	
	Integer selectCount(TAdminRole param);
	
	List<TAdminRole> selectByPage(@Param("param")TAdminRole param,@Param("offset")Integer offset,@Param("rows")Integer rows);
	
	Integer deleteById(String id);
}