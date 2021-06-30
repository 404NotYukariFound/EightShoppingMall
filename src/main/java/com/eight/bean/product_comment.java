package com.eight.bean;

import java.math.BigInteger;
import java.sql.Timestamp;

public class product_comment {
	private Long comment_id;
	private Long product_id;
	private BigInteger order_id;
	private Long user_id;
	private String title;
	private String content;
	private Integer audit_status;
	private Timestamp audit_time;
	private Timestamp modified_time;

	public product_comment() {
	}

	public product_comment(Long comment_id, Long product_id, BigInteger order_id, Long user_id, String title, String content, Integer audit_status, Timestamp audit_time, Timestamp modified_time) {
		this.comment_id = comment_id;
		this.product_id = product_id;
		this.order_id = order_id;
		this.user_id = user_id;
		this.title = title;
		this.content = content;
		this.audit_status = audit_status;
		this.audit_time = audit_time;
		this.modified_time = modified_time;
	}

	public Long getComment_id() {
		return comment_id;
	}

	public void setComment_id(Long comment_id) {
		this.comment_id = comment_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public BigInteger getOrder_id() {
		return order_id;
	}

	public void setOrder_id(BigInteger order_id) {
		this.order_id = order_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getAudit_status() {
		return audit_status;
	}

	public void setAudit_status(Integer audit_status) {
		this.audit_status = audit_status;
	}

	public Timestamp getAudit_time() {
		return audit_time;
	}

	public void setAudit_time(Timestamp audit_time) {
		this.audit_time = audit_time;
	}

	public Timestamp getModified_time() {
		return modified_time;
	}

	public void setModified_time(Timestamp modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	public String toString(){
		return "product_comment {" + 
				", comment_id='" + comment_id + '\'' + 
				", product_id='" + product_id + '\'' + 
				", order_id='" + order_id + '\'' + 
				", user_id='" + user_id + '\'' + 
				", title='" + title + '\'' + 
				", content='" + content + '\'' + 
				", audit_status='" + audit_status + '\'' + 
				", audit_time='" + audit_time + '\'' + 
				", modified_time='" + modified_time + '\'' + 
				"}";
	}
}