package com.lilike.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lilike.springcloud.entity.TbAcount;

/**
 * 
 * @author lyric
 *
 */
@Mapper
public interface TbAcountDao {

	public List<TbAcount> findAll();

	public void insertAcount(TbAcount bean);
	
}
