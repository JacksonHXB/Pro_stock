package com.hxb.dao;

import org.springframework.stereotype.Repository;


public interface StockDao {
	public String queryStockByCode(String code);
}
