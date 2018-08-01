package com.lilike.springcloud.service;

import java.util.List;

import com.lilike.springcloud.entity.TbAcount;

public interface TbAcountService {
	
	public List<TbAcount> findAll();

	public void insertAcount(TbAcount bean);
	
}