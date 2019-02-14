package com.hxb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxb.dao.KnowledgeDao;
import com.hxb.entity.Knowledge;
import com.hxb.service.KnowledgeService;

@Service
public class KnowledgeServiceImpl implements KnowledgeService{

	@Autowired
	KnowledgeDao knowledgeDao;

	/*根据关键字获取知识列表*/
	@Override
	public List<Knowledge> getKnowledgeByKeys(String[] keys) {
		knowledgeDao.queryKnowledgeByKeys(keys);
		return null;
	}

	/*分页获取所有的知识*/
	@Override
	public List<Knowledge> getAllKnowledge(String page, String size, String sort) {
		Map<String, String> paging = new HashMap<String, String>();
		paging.put("page", page);
		paging.put("size", size);
		paging.put("sort", sort);
		List<Knowledge> knowledgeList = knowledgeDao.queryAllKnowledge(paging);
		System.out.println(knowledgeList);
		
		return null;
	}
}



























