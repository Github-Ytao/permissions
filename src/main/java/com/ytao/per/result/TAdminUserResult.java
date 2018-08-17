package com.ytao.per.result;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;


public class TAdminUserResult implements Serializable{

	private static final long serialVersionUID = -1L;

	/**
	 *  
	 */
	private String id;
	/**
	 *  
	 */
	private String deptId;
	/**
	 *  
	 */
	private String roleId;
	/**
	 *  
	 */
	private String loginName;
	/**
	 *  
	 */
	private String password;
	/**
	 *  
	 */
	private String username;
	/**
	 *  
	 */
	private String mobile;
	/**
	 *  
	 */
	private String email;
	/**
	 *  
	 */
	private Date createTime;
	/**
	 *  
	 */
	private Date loginTime;
	/**
	 *  
	 */
	private Date lastLoginTime;
	/**
	 *  
	 */
	private Integer count;
	/**
	 *  
	 */
	private Integer status;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getDeptId() {
		return deptId;
	}
	
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getRoleId() {
		return roleId;
	}
	
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getLoginName() {
		return loginName;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}

    @Override
    public String toString() {
        return "TAdminUserResult{" +
                "id=" + id +
                    ", deptId='" + deptId +
                    ", roleId='" + roleId +
                    ", loginName='" + loginName +
                    ", password='" + password +
                    ", username='" + username +
                    ", mobile='" + mobile +
                    ", email='" + email +
                    ", createTime='" + createTime +
                    ", loginTime='" + loginTime +
                    ", lastLoginTime='" + lastLoginTime +
                    ", count='" + count +
                    ", status='" + status +
                    '}';
    }
}

