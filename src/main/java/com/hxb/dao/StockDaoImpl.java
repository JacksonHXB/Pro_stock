package com.hxb.dao;


import org.springframework.stereotype.Repository;

import com.hxb.entity.Stock;
import com.hxb.utils.HttpClientUtil;

@Repository
public class StockDaoImpl implements StockDao{
	
	@Override
	public String queryStockByCode(String code) {
		Stock stock = new Stock();
		String url = "http://hq.sinajs.cn/list=sh000001";
		String result = HttpClientUtil.sendHttpGet(url);
		System.out.println(result);
		
		return result;
	}
}
















































