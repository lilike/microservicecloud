package com.lilike.springcloud.entity;

import java.io.Serializable;


public class TbAcount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;
	
	private Integer money;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
