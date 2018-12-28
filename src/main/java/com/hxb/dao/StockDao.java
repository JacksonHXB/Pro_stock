package com.hxb.dao;

import com.hxb.entity.Stock;

public interface StockDao {
	public Stock queryStockByCode(String code);
}
