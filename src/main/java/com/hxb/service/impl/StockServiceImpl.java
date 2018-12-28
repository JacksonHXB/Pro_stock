package com.hxb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxb.dao.StockDao;
import com.hxb.entity.Stock;
import com.hxb.service.StockService;

@Service
public class StockServiceImpl implements StockService{

	@Autowired
	StockDao stockDao;
	
	@Override
	public Stock getStockInfo(String code) {
		return stockDao.queryStockByCode(code);
	}
	
	
	
}
