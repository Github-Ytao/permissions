package com.ytao.per.dao;

import java.util.List;
import java.lang.Integer;
import org.apache.ibatis.annotations.Param;
import com.ytao.per.bean.TMenu;


public interface TMenuMapper {

	TMenu selectById(Integer id);
	
	Integer insert(TMenu param);
	
	Integer update(TMenu param);
	
	Integer selectCount(TMenu param);
	
	List<TMenu> selectByPage(@Param("param")TMenu param,@Param("offset")Integer offset,@Param("rows")Integer rows);
	
	Integer deleteById(Integer id);
}