package com.lilike.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lilike.springcloud.dao.TbAcountDao;
import com.lilike.springcloud.entity.TbAcount;
import com.lilike.springcloud.service.TbAcountService;

@Service
public class TbAcountServiceImpl implements TbAcountService {

	@Autowired
	TbAcountDao dao;
	
	@Override
	public List<TbAcount> findAll() {
		return dao.findAll();
	}

	@Override
	public void insertAcount(TbAcount bean) {
		dao.insertAcount(bean);
	}

}
