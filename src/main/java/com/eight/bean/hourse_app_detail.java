package com.eight.bean;

import java.math.BigDecimal;

public class hourse_app_detail {
	private Integer h_detail_id;
	private BigDecimal h_height;
	private BigDecimal h_width;
	private BigDecimal h_weight;
	private String product_core;

	public hourse_app_detail() {
	}

	public hourse_app_detail(Integer h_detail_id, BigDecimal h_height, BigDecimal h_width, BigDecimal h_weight, String product_core) {
		this.h_detail_id = h_detail_id;
		this.h_height = h_height;
		this.h_width = h_width;
		this.h_weight = h_weight;
		this.product_core = product_core;
	}

	public Integer getH_detail_id() {
		return h_detail_id;
	}

	public void setH_detail_id(Integer h_detail_id) {
		this.h_detail_id = h_detail_id;
	}

	public BigDecimal getH_height() {
		return h_height;
	}

	public void setH_height(BigDecimal h_height) {
		this.h_height = h_height;
	}

	public BigDecimal getH_width() {
		return h_width;
	}

	public void setH_width(BigDecimal h_width) {
		this.h_width = h_width;
	}

	public BigDecimal getH_weight() {
		return h_weight;
	}

	public void setH_weight(BigDecimal h_weight) {
		this.h_weight = h_weight;
	}

	public String getProduct_core() {
		return product_core;
	}

	public void setProduct_core(String product_core) {
		this.product_core = product_core;
	}

	@Override
	public String toString(){
		return "hourse_app_detail {" + 
				", h_detail_id='" + h_detail_id + '\'' + 
				", h_height='" + h_height + '\'' + 
				", h_width='" + h_width + '\'' + 
				", h_weight='" + h_weight + '\'' + 
				", product_core='" + product_core + '\'' + 
				"}";
	}
}