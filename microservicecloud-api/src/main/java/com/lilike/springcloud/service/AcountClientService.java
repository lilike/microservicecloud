package com.lilike.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lilike.springcloud.entity.TbAcount;

/**
 * 
 * 修改microservicecloud-api工程,根据已经有的AcountClientService接口
 * 新建
 * 一个实现了FallbackFactory接口的类AcountClientServiceFallbackFactory
 * @author lyric
 *
 */
//@FeignClient(value="microservicecloud-acount")
@FeignClient(value="microservicecloud-acount",fallbackFactory=AcountClientServiceFallbackFactory.class)
public interface AcountClientService {

	@RequestMapping(value = "/acount/add", method = RequestMethod.POST)
	public void insertAcount(TbAcount bean);

	@RequestMapping(value = "/acount/findAll")
	public List<TbAcount> findAll();

}
