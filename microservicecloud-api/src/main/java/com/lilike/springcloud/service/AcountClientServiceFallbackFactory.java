package com.lilike.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.lilike.springcloud.entity.TbAcount;

import feign.hystrix.FallbackFactory;

@Component
public class AcountClientServiceFallbackFactory implements FallbackFactory<AcountClientService> {

	@Override
	public AcountClientService create(Throwable cause) {

		return new AcountClientService() {

			@Override
			public void insertAcount(TbAcount bean) {
				System.err.println("该服务降级了");
			}

			@Override
			public List<TbAcount> findAll() {
				List<TbAcount> list = new ArrayList<TbAcount>();
				TbAcount tb = new TbAcount();
				tb.setMoney(404);
				tb.setUsername("目前BIGONE正在维护中,预计需要2小时......");
				list.add(tb);
				return list;
			}
			
		};
	}

}
