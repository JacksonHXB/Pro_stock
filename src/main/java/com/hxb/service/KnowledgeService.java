package com.hxb.service;


import com.hxb.entity.Knowledge;
import com.hxb.entity.RespEntity;

public interface KnowledgeService {
	
	/*删除知识*/
	public RespEntity delKnowledge(String id);
	
	/*搜索知识*/
	public RespEntity getKnowledges(String key, String page, String size, String sort);
	
	/*添加或者是更新知识*/
	public RespEntity addOrUpdate(Knowledge knowledge);

	
}
