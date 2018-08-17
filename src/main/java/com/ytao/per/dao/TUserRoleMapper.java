package com.ytao.per.dao;

import java.util.List;
import java.lang.Integer;
import org.apache.ibatis.annotations.Param;
import com.ytao.per.bean.TUserRole;


public interface TUserRoleMapper {

	TUserRole selectById(Integer id);
	
	Integer insert(TUserRole param);
	
	Integer update(TUserRole param);
	
	Integer selectCount(TUserRole param);
	
	List<TUserRole> selectByPage(@Param("param")TUserRole param,@Param("offset")Integer offset,@Param("rows")Integer rows);
	
	Integer deleteById(Integer id);

	Integer deleteUserRoleByUserId(String userId);

}