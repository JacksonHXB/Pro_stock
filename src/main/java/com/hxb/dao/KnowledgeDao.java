package com.hxb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hxb.entity.Knowledge;

@Mapper
public interface KnowledgeDao {

	/*根据关键字模糊查询知识库*/
	public void queryKnowledgeByKeys(String[] keys);

	/*根据关键字分页获取知识列表*/
	public List<Knowledge> queryAllKnowledge(@Param("key")String key, @Param("page")int page, @Param("size")int size, @Param("sort")String sort);

}
