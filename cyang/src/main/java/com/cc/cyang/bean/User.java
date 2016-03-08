package com.cc.cyang.bean;
/**
 * 
 *
 * @author: cyang
 * @Description: TODO(用一句话描述该文件做什么) 
 * @Date: 2016年3月5日 下午1:56:31 
 *
 */
public class User {
	private int id;
	private String name;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ "]";
	}
	
}
