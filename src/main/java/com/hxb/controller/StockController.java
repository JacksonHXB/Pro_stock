package com.hxb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hxb.service.StockService;

@RestController
public class StockController {
	
	
	@Autowired
	StockService stockService;
	
	@GetMapping("/stock/{code}")
	public String getStockInfo(@PathVariable("code") String code){
		String result = stockService.getStockInfo(code);
		return result;
	}
}
