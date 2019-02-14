package com.hxb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hxb.entity.Knowledge;
import com.hxb.service.KnowledgeService;

@RestController
public class KnowledgeController {
	
	@Autowired
	KnowledgeService knowledgeService;
	
	/*模糊查询知识库*/
	@GetMapping("/knowledge/getKnowledges")
	public void getKnowledges(String[] keys) {
		List<Knowledge> knowledges = knowledgeService.getKnowledgeByKeys(keys);
		System.out.println(knowledges);
		System.out.println("测试");
	}
	
	/*获取所有的知识*/
	@GetMapping("/knowledge/getAllKnowledge")
	public List<Knowledge> getAllKnowledge(String page, String size, String sort) {
		System.out.println(page);
		System.out.println(size);
		System.out.println(sort);
		List<Knowledge> knowledges = knowledgeService.getAllKnowledge(page, size, sort);
		return null;
	}
}




































