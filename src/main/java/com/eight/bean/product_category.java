package com.eight.bean;

import java.sql.Timestamp;

public class product_category {
	private Integer category_id;
	private String category_name;
	private String category_code;
	private Integer parent_id;
	private Integer category_level;
	private Integer category_status;
	private Timestamp modified_time;

	public product_category() {
	}

	public product_category(Integer category_id, String category_name, String category_code, Integer parent_id, Integer category_level, Integer category_status, Timestamp modified_time) {
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_code = category_code;
		this.parent_id = parent_id;
		this.category_level = category_level;
		this.category_status = category_status;
		this.modified_time = modified_time;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_code() {
		return category_code;
	}

	public void setCategory_code(String category_code) {
		this.category_code = category_code;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public Integer getCategory_level() {
		return category_level;
	}

	public void setCategory_level(Integer category_level) {
		this.category_level = category_level;
	}

	public Integer getCategory_status() {
		return category_status;
	}

	public void setCategory_status(Integer category_status) {
		this.category_status = category_status;
	}

	public Timestamp getModified_time() {
		return modified_time;
	}

	public void setModified_time(Timestamp modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	public String toString(){
		return "product_category {" + 
				", category_id='" + category_id + '\'' + 
				", category_name='" + category_name + '\'' + 
				", category_code='" + category_code + '\'' + 
				", parent_id='" + parent_id + '\'' + 
				", category_level='" + category_level + '\'' + 
				", category_status='" + category_status + '\'' + 
				", modified_time='" + modified_time + '\'' + 
				"}";
	}
}