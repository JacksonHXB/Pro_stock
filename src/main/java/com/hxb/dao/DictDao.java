package com.hxb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hxb.entity.DictItem;


@Mapper
public interface DictDao {

	public List<DictItem> getDictItems();

}
