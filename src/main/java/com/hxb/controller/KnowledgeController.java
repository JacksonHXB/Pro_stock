package com.hxb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hxb.entity.Knowlege;
import com.hxb.service.KnowlegeService;
import com.hxb.service.StockService;

@RestController
public class KnowledgeController {
	
	
	@Autowired
	StockService stockService;
	
//	@Autowired
//	KnowlegeService knowlege;
//	
	/*保存知识库*/
//	@PutMapping
//	public Stock saveKnowlege(String code){
//		Stock stock = stockService.getStockInfo(code);
//		return stock;
//	}
	
	/*根据关键字查询知识*/
//	@GetMapping
//	public Knowlege getKnowlege(String keyword) {
//		
//	}
}




































