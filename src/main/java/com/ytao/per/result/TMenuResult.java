package com.ytao.per.result;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;


public class TMenuResult implements Serializable{

	private static final long serialVersionUID = -1L;

	/**
	 *  
	 */
	private String id;
	/**
	 *  
	 */
	private String parentId;
	/**
	 *  
	 */
	private String name;
	/**
	 *  
	 */
	private String images;
	/**
	 *  
	 */
	private String authId;
	/**
	 *  
	 */
	private String description;
	/**
	 *  
	 */
	private Integer orderBy;
	/**
	 *  
	 */
	private String isparent;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getParentId() {
		return parentId;
	}
	
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getImages() {
		return images;
	}
	
	public void setImages(String images) {
		this.images = images;
	}
	public String getAuthId() {
		return authId;
	}
	
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getOrderBy() {
		return orderBy;
	}
	
	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}
	public String getIsparent() {
		return isparent;
	}
	
	public void setIsparent(String isparent) {
		this.isparent = isparent;
	}

    @Override
    public String toString() {
        return "TMenuResult{" +
                "id=" + id +
                    ", parentId='" + parentId +
                    ", name='" + name +
                    ", images='" + images +
                    ", authId='" + authId +
                    ", description='" + description +
                    ", orderBy='" + orderBy +
                    ", isparent='" + isparent +
                    '}';
    }
}

