package com.ytao.per.result;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;


public class TUserRoleResult implements Serializable{

	private static final long serialVersionUID = -1L;

	/**
	 *  
	 */
	private String id;
	/**
	 *  
	 */
	private String userId;
	/**
	 *  
	 */
	private String roleId;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRoleId() {
		return roleId;
	}
	
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

    @Override
    public String toString() {
        return "TUserRoleResult{" +
                "id=" + id +
                    ", userId='" + userId +
                    ", roleId='" + roleId +
                    '}';
    }
}

