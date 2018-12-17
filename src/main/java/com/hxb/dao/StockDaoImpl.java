package com.hxb.dao;


import org.springframework.stereotype.Repository;

@Repository
public class StockDaoImpl implements StockDao{
	
	@Override
	public String queryStockByCode(String code) {
		String url = "http://hq.sinajs.cn/list=sh601006";
		
		String result = request("sh601006");
		
		return result;
	}
	
	//http://hq.sinajs.cn/list=sh601006
	public String request(String url){
		
		
		
		return null;
	}
}
















































