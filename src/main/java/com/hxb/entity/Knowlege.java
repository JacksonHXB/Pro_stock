package com.hxb.entity;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Knowlege {
	private Integer id;
	private String title;
	private String content;
	private String keyword;
	private Date time;
	private String[] websites;
}
