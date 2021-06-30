package com.eight.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class order_detail {
	private Long order_detail_id;
	private Long order_id;
	private Long product_id;
	private String product_name;
	private Integer product_amount;
	private BigDecimal product_price;
	private BigDecimal fee_money;
	private Timestamp modified_time;

	public order_detail() {
	}

	public order_detail(Long order_detail_id, Long order_id, Long product_id, String product_name, Integer product_amount, BigDecimal product_price, BigDecimal fee_money, Timestamp modified_time) {
		this.order_detail_id = order_detail_id;
		this.order_id = order_id;
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_amount = product_amount;
		this.product_price = product_price;
		this.fee_money = fee_money;
		this.modified_time = modified_time;
	}

	public Long getOrder_detail_id() {
		return order_detail_id;
	}

	public void setOrder_detail_id(Long order_detail_id) {
		this.order_detail_id = order_detail_id;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Integer getProduct_amount() {
		return product_amount;
	}

	public void setProduct_amount(Integer product_amount) {
		this.product_amount = product_amount;
	}

	public BigDecimal getProduct_price() {
		return product_price;
	}

	public void setProduct_price(BigDecimal product_price) {
		this.product_price = product_price;
	}

	public BigDecimal getFee_money() {
		return fee_money;
	}

	public void setFee_money(BigDecimal fee_money) {
		this.fee_money = fee_money;
	}

	public Timestamp getModified_time() {
		return modified_time;
	}

	public void setModified_time(Timestamp modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	public String toString(){
		return "order_detail {" + 
				", order_detail_id='" + order_detail_id + '\'' + 
				", order_id='" + order_id + '\'' + 
				", product_id='" + product_id + '\'' + 
				", product_name='" + product_name + '\'' + 
				", product_amount='" + product_amount + '\'' + 
				", product_price='" + product_price + '\'' + 
				", fee_money='" + fee_money + '\'' + 
				", modified_time='" + modified_time + '\'' + 
				"}";
	}
}