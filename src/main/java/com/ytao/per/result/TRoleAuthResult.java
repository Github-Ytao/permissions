package com.ytao.per.result;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;


public class TRoleAuthResult implements Serializable{

	private static final long serialVersionUID = -1L;

	/**
	 *  
	 */
	private String id;
	/**
	 *  
	 */
	private String roleId;
	/**
	 *  
	 */
	private String authId;
	/**
	 *  (0:可访问， 1:可授权)
	 */
	private Integer authType;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleId() {
		return roleId;
	}
	
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getAuthId() {
		return authId;
	}
	
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public Integer getAuthType() {
		return authType;
	}
	
	public void setAuthType(Integer authType) {
		this.authType = authType;
	}

    @Override
    public String toString() {
        return "TRoleAuthResult{" +
                "id=" + id +
                    ", roleId='" + roleId +
                    ", authId='" + authId +
                    ", authType='" + authType +
                    '}';
    }
}

