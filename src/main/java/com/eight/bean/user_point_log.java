package com.eight.bean;

import java.sql.Timestamp;

public class user_point_log {
	private Long point_id;
	private Long user_id;
	private Integer source;
	private Long refer_number;
	private Integer change_point;
	private Timestamp create_time;

	public user_point_log() {
	}

	public user_point_log(Long point_id, Long user_id, Integer source, Long refer_number, Integer change_point, Timestamp create_time) {
		this.point_id = point_id;
		this.user_id = user_id;
		this.source = source;
		this.refer_number = refer_number;
		this.change_point = change_point;
		this.create_time = create_time;
	}

	public Long getPoint_id() {
		return point_id;
	}

	public void setPoint_id(Long point_id) {
		this.point_id = point_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public Long getRefer_number() {
		return refer_number;
	}

	public void setRefer_number(Long refer_number) {
		this.refer_number = refer_number;
	}

	public Integer getChange_point() {
		return change_point;
	}

	public void setChange_point(Integer change_point) {
		this.change_point = change_point;
	}

	public Timestamp getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}

	@Override
	public String toString(){
		return "user_point_log {" + 
				", point_id='" + point_id + '\'' + 
				", user_id='" + user_id + '\'' + 
				", source='" + source + '\'' + 
				", refer_number='" + refer_number + '\'' + 
				", change_point='" + change_point + '\'' + 
				", create_time='" + create_time + '\'' + 
				"}";
	}
}