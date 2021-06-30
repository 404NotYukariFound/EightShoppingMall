package com.eight.bean;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;


public class order_master {

	private Long order_id;
	private BigInteger order_sn;
	private Long user_id;
	private String shipping_user;
	private Integer province;
	private Integer city;
	private Integer district;
	private String address;
	private Integer payment_method;
	private BigDecimal order_money;
	private BigDecimal district_money;
	private BigDecimal shipping_money;
	private BigDecimal payment_money;
	private String shoppingMall_name;
	private Timestamp create_time;
	private Timestamp shipping_time;
	private Timestamp pay_time;
	private Timestamp receive_time;
	private Integer order_status;
	private Long order_point;
	private Timestamp modified_time;

	public order_master() {
	}

	public order_master(Long order_id, BigInteger order_sn, Long user_id, String shipping_user, Integer province, Integer city, Integer district, String address, Integer payment_method, BigDecimal order_money, BigDecimal district_money, BigDecimal shipping_money, BigDecimal payment_money, String shoppingMall_name, Timestamp create_time, Timestamp shipping_time, Timestamp pay_time, Timestamp receive_time, Integer order_status, Long order_point, Timestamp modified_time) {
		this.order_id = order_id;
		this.order_sn = order_sn;
		this.user_id = user_id;
		this.shipping_user = shipping_user;
		this.province = province;
		this.city = city;
		this.district = district;
		this.address = address;
		this.payment_method = payment_method;
		this.order_money = order_money;
		this.district_money = district_money;
		this.shipping_money = shipping_money;
		this.payment_money = payment_money;
		this.shoppingMall_name = shoppingMall_name;
		this.create_time = create_time;
		this.shipping_time = shipping_time;
		this.pay_time = pay_time;
		this.receive_time = receive_time;
		this.order_status = order_status;
		this.order_point = order_point;
		this.modified_time = modified_time;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public BigInteger getOrder_sn() {
		return order_sn;
	}

	public void setOrder_sn(BigInteger order_sn) {
		this.order_sn = order_sn;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getShipping_user() {
		return shipping_user;
	}

	public void setShipping_user(String shipping_user) {
		this.shipping_user = shipping_user;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getDistrict() {
		return district;
	}

	public void setDistrict(Integer district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(Integer payment_method) {
		this.payment_method = payment_method;
	}

	public BigDecimal getOrder_money() {
		return order_money;
	}

	public void setOrder_money(BigDecimal order_money) {
		this.order_money = order_money;
	}

	public BigDecimal getDistrict_money() {
		return district_money;
	}

	public void setDistrict_money(BigDecimal district_money) {
		this.district_money = district_money;
	}

	public BigDecimal getShipping_money() {
		return shipping_money;
	}

	public void setShipping_money(BigDecimal shipping_money) {
		this.shipping_money = shipping_money;
	}

	public BigDecimal getPayment_money() {
		return payment_money;
	}

	public void setPayment_money(BigDecimal payment_money) {
		this.payment_money = payment_money;
	}

	public String getShoppingMall_name() {
		return shoppingMall_name;
	}

	public void setShoppingMall_name(String shoppingMall_name) {
		this.shoppingMall_name = shoppingMall_name;
	}

	public Timestamp getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}

	public Timestamp getShipping_time() {
		return shipping_time;
	}

	public void setShipping_time(Timestamp shipping_time) {
		this.shipping_time = shipping_time;
	}

	public Timestamp getPay_time() {
		return pay_time;
	}

	public void setPay_time(Timestamp pay_time) {
		this.pay_time = pay_time;
	}

	public Timestamp getReceive_time() {
		return receive_time;
	}

	public void setReceive_time(Timestamp receive_time) {
		this.receive_time = receive_time;
	}

	public Integer getOrder_status() {
		return order_status;
	}

	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}

	public Long getOrder_point() {
		return order_point;
	}

	public void setOrder_point(Long order_point) {
		this.order_point = order_point;
	}

	public Timestamp getModified_time() {
		return modified_time;
	}

	public void setModified_time(Timestamp modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	public String toString(){
		return "order_master {" + 
				", order_id='" + order_id + '\'' + 
				", order_sn='" + order_sn + '\'' + 
				", user_id='" + user_id + '\'' + 
				", shipping_user='" + shipping_user + '\'' + 
				", province='" + province + '\'' + 
				", city='" + city + '\'' + 
				", district='" + district + '\'' + 
				", address='" + address + '\'' + 
				", payment_method='" + payment_method + '\'' + 
				", order_money='" + order_money + '\'' + 
				", district_money='" + district_money + '\'' + 
				", shipping_money='" + shipping_money + '\'' + 
				", payment_money='" + payment_money + '\'' + 
				", shoppingMall_name='" + shoppingMall_name + '\'' + 
				", create_time='" + create_time + '\'' + 
				", shipping_time='" + shipping_time + '\'' + 
				", pay_time='" + pay_time + '\'' + 
				", receive_time='" + receive_time + '\'' + 
				", order_status='" + order_status + '\'' + 
				", order_point='" + order_point + '\'' + 
				", modified_time='" + modified_time + '\'' + 
				"}";
	}
}