package com.hxb.service;

import java.util.List;

import com.hxb.entity.Knowledge;

public interface KnowledgeService {
	
	/*根据关键字获取知识*/
	public List<Knowledge> getKnowledgeByKeys(String[] keys);

	/*分页获取知识列表*/
	public List<Knowledge> getAllKnowledge(String page, String size, String sort);
	
}
