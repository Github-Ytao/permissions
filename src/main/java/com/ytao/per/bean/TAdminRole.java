package com.ytao.per.bean;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;


public class TAdminRole implements Serializable{

	private static final long serialVersionUID = -1L;

	/**
	 *  
	 */
	private String id;
	/**
	 *  
	 */
	private String name;
	/**
	 *  
	 */
	private String authId;
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
	/**
	 *  
	 */
	private String description;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthId() {
		return authId;
	}
	
	public void setAuthId(String authId) {
		this.authId = authId;
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
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

    @Override
    public String toString() {
        return "TAdminRole{" +
                "id=" + id +
                    ", name='" + name +
                    ", authId='" + authId +
                    ", moduleId='" + moduleId +
                    ", createTime='" + createTime +
                    ", updateTime='" + updateTime +
                    ", description='" + description +
                    '}';
    }
}

