package com.hxb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hxb.entity.Stock;
import com.hxb.service.StockService;

@RestController
public class StockController {
	
	
	@Autowired
	StockService stockService;
	
	/*根据股票编码获取股票基本信息*/
	@GetMapping("/stock/{code}")//sz399001深证成指，sz000063中兴通讯
	public Stock getStockInfo(@PathVariable("code") String code){
		Stock stock = stockService.getStockInfo(code);
		return stock;
	}
}
