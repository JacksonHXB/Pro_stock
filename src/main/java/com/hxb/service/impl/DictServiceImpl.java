package com.hxb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.hxb.dao.DictDao;
import com.hxb.entity.DictItem;
import com.hxb.entity.RespEntity;
import com.hxb.service.DictService;
import com.hxb.utils.RespCode;

@Service
public class DictServiceImpl implements DictService {

	@Autowired
	DictDao dictDao;
	
	@Resource 
	private RedisTemplate redisTemplate;
	
	@Override
	public RespEntity findAllDicts() {
		redisTemplate.boundValueOps("name").set("itcast");
		String str = (String) redisTemplate.boundValueOps("name").get();
		System.out.println(str);

		List<DictItem> dictItemList = dictDao.getDictItems();
		return new RespEntity(RespCode.SUCCESS, dictItemList);
	}

}
































