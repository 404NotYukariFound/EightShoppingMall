package com.eight.bean;

public class shoppingmall {
	private Long shoppingMall_id;
	private String log_url;
	private String shoppingMall_name;
	private String shoppingMall_contacts;
	private Integer shoppingMall_phone;

	public shoppingmall() {
	}

	public shoppingmall(Long shoppingMall_id, String log_url, String shoppingMall_name, String shoppingMall_contacts, Integer shoppingMall_phone) {
		this.shoppingMall_id = shoppingMall_id;
		this.log_url = log_url;
		this.shoppingMall_name = shoppingMall_name;
		this.shoppingMall_contacts = shoppingMall_contacts;
		this.shoppingMall_phone = shoppingMall_phone;
	}

	public Long getShoppingMall_id() {
		return shoppingMall_id;
	}

	public void setShoppingMall_id(Long shoppingMall_id) {
		this.shoppingMall_id = shoppingMall_id;
	}

	public String getLog_url() {
		return log_url;
	}

	public void setLog_url(String log_url) {
		this.log_url = log_url;
	}

	public String getShoppingMall_name() {
		return shoppingMall_name;
	}

	public void setShoppingMall_name(String shoppingMall_name) {
		this.shoppingMall_name = shoppingMall_name;
	}

	public String getShoppingMall_contacts() {
		return shoppingMall_contacts;
	}

	public void setShoppingMall_contacts(String shoppingMall_contacts) {
		this.shoppingMall_contacts = shoppingMall_contacts;
	}

	public Integer getShoppingMall_phone() {
		return shoppingMall_phone;
	}

	public void setShoppingMall_phone(Integer shoppingMall_phone) {
		this.shoppingMall_phone = shoppingMall_phone;
	}

	@Override
	public String toString(){
		return "shoppingmall {" + 
				", shoppingMall_id='" + shoppingMall_id + '\'' + 
				", log_url='" + log_url + '\'' + 
				", shoppingMall_name='" + shoppingMall_name + '\'' + 
				", shoppingMall_contacts='" + shoppingMall_contacts + '\'' + 
				", shoppingMall_phone='" + shoppingMall_phone + '\'' + 
				"}";
	}
}