package com.hxb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hxb.entity.RespEntity;
import com.hxb.service.DictService;

@Controller
public class DictController {
	
	@Autowired
	DictService dictService;

	public RespEntity getDictItems() {
		RespEntity result = dictService.findAllDicts();
		return result;
	}
}
