package com.eight.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class product_warehouse {
	private Long pw_id;
	private Long product_id;
	private Long current_cnt;
	private Long product_sales;
	private BigDecimal product_sell_price;
	private Timestamp modified_time;

	public product_warehouse() {
	}

	public product_warehouse(Long pw_id, Long product_id, Long current_cnt, Long product_sales, BigDecimal product_sell_price, Timestamp modified_time) {
		this.pw_id = pw_id;
		this.product_id = product_id;
		this.current_cnt = current_cnt;
		this.product_sales = product_sales;
		this.product_sell_price = product_sell_price;
		this.modified_time = modified_time;
	}

	public Long getPw_id() {
		return pw_id;
	}

	public void setPw_id(Long pw_id) {
		this.pw_id = pw_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getCurrent_cnt() {
		return current_cnt;
	}

	public void setCurrent_cnt(Long current_cnt) {
		this.current_cnt = current_cnt;
	}

	public Long getProduct_sales() {
		return product_sales;
	}

	public void setProduct_sales(Long product_sales) {
		this.product_sales = product_sales;
	}

	public BigDecimal getProduct_sell_price() {
		return product_sell_price;
	}

	public void setProduct_sell_price(BigDecimal product_sell_price) {
		this.product_sell_price = product_sell_price;
	}

	public Timestamp getModified_time() {
		return modified_time;
	}

	public void setModified_time(Timestamp modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	public String toString(){
		return "product_warehouse {" + 
				", pw_id='" + pw_id + '\'' + 
				", product_id='" + product_id + '\'' + 
				", current_cnt='" + current_cnt + '\'' + 
				", product_sales='" + product_sales + '\'' + 
				", product_sell_price='" + product_sell_price + '\'' + 
				", modified_time='" + modified_time + '\'' + 
				"}";
	}
}