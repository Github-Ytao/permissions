package com.ytao.per.result;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;


public class TAdminAuthResult implements Serializable{

	private static final long serialVersionUID = -1L;

	/**
	 *  
	 */
	private String id;
	/**
	 *  
	 */
	private String authName;
	/**
	 *  
	 */
	private String authUrl;
	/**
	 *  
	 */
	private String description;
	/**
	 *  
	 */
	private String moduleId;
	/**
	 *  
	 */
	private Date createTime;
	/**
	 *  
	 */
	private Date updateTime;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthName() {
		return authName;
	}
	
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public String getAuthUrl() {
		return authUrl;
	}
	
	public void setAuthUrl(String authUrl) {
		this.authUrl = authUrl;
	}
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getModuleId() {
		return moduleId;
	}
	
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

    @Override
    public String toString() {
        return "TAdminAuthResult{" +
                "id=" + id +
                    ", authName='" + authName +
                    ", authUrl='" + authUrl +
                    ", description='" + description +
                    ", moduleId='" + moduleId +
                    ", createTime='" + createTime +
                    ", updateTime='" + updateTime +
                    '}';
    }
}

