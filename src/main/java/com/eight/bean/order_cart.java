package com.eight.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class order_cart {
	private Long cart_id;
	private Long user_id;
	private Long product_id;
	private Integer product_total_amount;
	private BigDecimal price;
	private Timestamp add_time;
	private Timestamp modified_time;

	public order_cart() {
	}

	public order_cart(Long cart_id, Long user_id, Long product_id, Integer product_total_amount, BigDecimal price, Timestamp add_time, Timestamp modified_time) {
		this.cart_id = cart_id;
		this.user_id = user_id;
		this.product_id = product_id;
		this.product_total_amount = product_total_amount;
		this.price = price;
		this.add_time = add_time;
		this.modified_time = modified_time;
	}

	public Long getCart_id() {
		return cart_id;
	}

	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Integer getProduct_total_amount() {
		return product_total_amount;
	}

	public void setProduct_total_amount(Integer product_total_amount) {
		this.product_total_amount = product_total_amount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Timestamp getAdd_time() {
		return add_time;
	}

	public void setAdd_time(Timestamp add_time) {
		this.add_time = add_time;
	}

	public Timestamp getModified_time() {
		return modified_time;
	}

	public void setModified_time(Timestamp modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	public String toString(){
		return "order_cart {" + 
				", cart_id='" + cart_id + '\'' + 
				", user_id='" + user_id + '\'' + 
				", product_id='" + product_id + '\'' + 
				", product_total_amount='" + product_total_amount + '\'' + 
				", price='" + price + '\'' + 
				", add_time='" + add_time + '\'' + 
				", modified_time='" + modified_time + '\'' + 
				"}";
	}
}