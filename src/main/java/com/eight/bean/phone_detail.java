package com.eight.bean;

import java.math.BigDecimal;

public class phone_detail {
	private Integer p_detail_id;
	private BigDecimal p_height;
	private BigDecimal p_width;
	private BigDecimal p_size;
	private BigDecimal p_weight;
	private String p_color;
	private String p_meal;
	private String p_version;
	private String p_capacity;
	private String product_core;

	public phone_detail() {
	}

	public phone_detail(Integer p_detail_id, BigDecimal p_height, BigDecimal p_width, BigDecimal p_size, BigDecimal p_weight, String p_color, String p_meal, String p_version, String p_capacity, String product_core) {
		this.p_detail_id = p_detail_id;
		this.p_height = p_height;
		this.p_width = p_width;
		this.p_size = p_size;
		this.p_weight = p_weight;
		this.p_color = p_color;
		this.p_meal = p_meal;
		this.p_version = p_version;
		this.p_capacity = p_capacity;
		this.product_core = product_core;
	}

	public Integer getP_detail_id() {
		return p_detail_id;
	}

	public void setP_detail_id(Integer p_detail_id) {
		this.p_detail_id = p_detail_id;
	}

	public BigDecimal getP_height() {
		return p_height;
	}

	public void setP_height(BigDecimal p_height) {
		this.p_height = p_height;
	}

	public BigDecimal getP_width() {
		return p_width;
	}

	public void setP_width(BigDecimal p_width) {
		this.p_width = p_width;
	}

	public BigDecimal getP_size() {
		return p_size;
	}

	public void setP_size(BigDecimal p_size) {
		this.p_size = p_size;
	}

	public BigDecimal getP_weight() {
		return p_weight;
	}

	public void setP_weight(BigDecimal p_weight) {
		this.p_weight = p_weight;
	}

	public String getP_color() {
		return p_color;
	}

	public void setP_color(String p_color) {
		this.p_color = p_color;
	}

	public String getP_meal() {
		return p_meal;
	}

	public void setP_meal(String p_meal) {
		this.p_meal = p_meal;
	}

	public String getP_version() {
		return p_version;
	}

	public void setP_version(String p_version) {
		this.p_version = p_version;
	}

	public String getP_capacity() {
		return p_capacity;
	}

	public void setP_capacity(String p_capacity) {
		this.p_capacity = p_capacity;
	}

	public String getProduct_core() {
		return product_core;
	}

	public void setProduct_core(String product_core) {
		this.product_core = product_core;
	}

	@Override
	public String toString(){
		return "phone_detail {" + 
				", p_detail_id='" + p_detail_id + '\'' + 
				", p_height='" + p_height + '\'' + 
				", p_width='" + p_width + '\'' + 
				", p_size='" + p_size + '\'' + 
				", p_weight='" + p_weight + '\'' + 
				", p_color='" + p_color + '\'' + 
				", p_meal='" + p_meal + '\'' + 
				", p_version='" + p_version + '\'' + 
				", p_capacity='" + p_capacity + '\'' + 
				", product_core='" + product_core + '\'' + 
				"}";
	}
}