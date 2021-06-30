package com.eight.bean;

public class book_detail {
	private Integer b_detail_id;
	private String b_author;
	private String b_publisher;
	private String product_core;

	public book_detail() {
	}

	public book_detail(Integer b_detail_id, String b_author, String b_publisher, String product_core) {
		this.b_detail_id = b_detail_id;
		this.b_author = b_author;
		this.b_publisher = b_publisher;
		this.product_core = product_core;
	}

	public Integer getB_detail_id() {
		return b_detail_id;
	}

	public void setB_detail_id(Integer b_detail_id) {
		this.b_detail_id = b_detail_id;
	}

	public String getB_author() {
		return b_author;
	}

	public void setB_author(String b_author) {
		this.b_author = b_author;
	}

	public String getB_publisher() {
		return b_publisher;
	}

	public void setB_publisher(String b_publisher) {
		this.b_publisher = b_publisher;
	}

	public String getProduct_core() {
		return product_core;
	}

	public void setProduct_core(String product_core) {
		this.product_core = product_core;
	}

	@Override
	public String toString(){
		return "book_detail {" + 
				", b_detail_id='" + b_detail_id + '\'' + 
				", b_author='" + b_author + '\'' + 
				", b_publisher='" + b_publisher + '\'' + 
				", product_core='" + product_core + '\'' + 
				"}";
	}
}