package com.eight.bean;

import java.sql.Timestamp;

public class product_pic_info {
	private Long product_pic_id;
	private Long product_id;
	private String pic_desc;
	private String pic_url;
	private Integer is_master;
	private Integer pic_status;
	private Timestamp modified_time;

	public product_pic_info() {
	}

	public product_pic_info(Long product_pic_id, Long product_id, String pic_desc, String pic_url, Integer is_master, Integer pic_status, Timestamp modified_time) {
		this.product_pic_id = product_pic_id;
		this.product_id = product_id;
		this.pic_desc = pic_desc;
		this.pic_url = pic_url;
		this.is_master = is_master;
		this.pic_status = pic_status;
		this.modified_time = modified_time;
	}

	public Long getProduct_pic_id() {
		return product_pic_id;
	}

	public void setProduct_pic_id(Long product_pic_id) {
		this.product_pic_id = product_pic_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getPic_desc() {
		return pic_desc;
	}

	public void setPic_desc(String pic_desc) {
		this.pic_desc = pic_desc;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	public Integer getIs_master() {
		return is_master;
	}

	public void setIs_master(Integer is_master) {
		this.is_master = is_master;
	}

	public Integer getPic_status() {
		return pic_status;
	}

	public void setPic_status(Integer pic_status) {
		this.pic_status = pic_status;
	}

	public Timestamp getModified_time() {
		return modified_time;
	}

	public void setModified_time(Timestamp modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	public String toString(){
		return "product_pic_info {" + 
				", product_pic_id='" + product_pic_id + '\'' + 
				", product_id='" + product_id + '\'' + 
				", pic_desc='" + pic_desc + '\'' + 
				", pic_url='" + pic_url + '\'' + 
				", is_master='" + is_master + '\'' + 
				", pic_status='" + pic_status + '\'' + 
				", modified_time='" + modified_time + '\'' + 
				"}";
	}
}