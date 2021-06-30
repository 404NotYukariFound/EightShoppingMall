package com.eight.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class product_info {
	private Long product_id;
	private String product_core;
	private String product_name;
	private Integer one_category_id;
	private Integer two_category_id;
	private BigDecimal real_price;
	private BigDecimal price;
	private Integer publish_status;
	private Timestamp production_date;
	private Integer shelf_life;
	private String descript;
	private Timestamp indate;
	private Timestamp modified_time;

	public product_info() {
	}

	public product_info(Long product_id, String product_core, String product_name, Integer one_category_id, Integer two_category_id, BigDecimal real_price, BigDecimal price, Integer publish_status, Timestamp production_date, Integer shelf_life, String descript, Timestamp indate, Timestamp modified_time) {
		this.product_id = product_id;
		this.product_core = product_core;
		this.product_name = product_name;
		this.one_category_id = one_category_id;
		this.two_category_id = two_category_id;
		this.real_price = real_price;
		this.price = price;
		this.publish_status = publish_status;
		this.production_date = production_date;
		this.shelf_life = shelf_life;
		this.descript = descript;
		this.indate = indate;
		this.modified_time = modified_time;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_core() {
		return product_core;
	}

	public void setProduct_core(String product_core) {
		this.product_core = product_core;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Integer getOne_category_id() {
		return one_category_id;
	}

	public void setOne_category_id(Integer one_category_id) {
		this.one_category_id = one_category_id;
	}

	public Integer getTwo_category_id() {
		return two_category_id;
	}

	public void setTwo_category_id(Integer two_category_id) {
		this.two_category_id = two_category_id;
	}

	public BigDecimal getReal_price() {
		return real_price;
	}

	public void setReal_price(BigDecimal real_price) {
		this.real_price = real_price;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getPublish_status() {
		return publish_status;
	}

	public void setPublish_status(Integer publish_status) {
		this.publish_status = publish_status;
	}

	public Timestamp getProduction_date() {
		return production_date;
	}

	public void setProduction_date(Timestamp production_date) {
		this.production_date = production_date;
	}

	public Integer getShelf_life() {
		return shelf_life;
	}

	public void setShelf_life(Integer shelf_life) {
		this.shelf_life = shelf_life;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public Timestamp getIndate() {
		return indate;
	}

	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}

	public Timestamp getModified_time() {
		return modified_time;
	}

	public void setModified_time(Timestamp modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	public String toString(){
		return "product_info {" + 
				", product_id='" + product_id + '\'' + 
				", product_core='" + product_core + '\'' + 
				", product_name='" + product_name + '\'' + 
				", one_category_id='" + one_category_id + '\'' + 
				", two_category_id='" + two_category_id + '\'' + 
				", real_price='" + real_price + '\'' + 
				", price='" + price + '\'' + 
				", publish_status='" + publish_status + '\'' + 
				", production_date='" + production_date + '\'' + 
				", shelf_life='" + shelf_life + '\'' + 
				", descript='" + descript + '\'' + 
				", indate='" + indate + '\'' + 
				", modified_time='" + modified_time + '\'' + 
				"}";
	}
}