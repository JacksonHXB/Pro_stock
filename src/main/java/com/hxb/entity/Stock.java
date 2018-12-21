package com.hxb.entity;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*网络上的股票*/
@Getter
@Setter
@NoArgsConstructor
public class Stock {
	private Integer id;//唯一标识
	private String code;//上市公司代码
	private String name;//公司名称
	private String simpleName;//股票名称
	private Float open;//今日开盘价
	private Float close;//昨日收盘价
	private Float price;//当前价格
	private Float hight;//今日最高价
	private Float low;//今日最低价
	private Float buyPrice;//竞买价，即买一报价
	private Float sellPrice;//竞卖价
	private Integer dealNum;//成交的股票数，由于股票交易以一百股为基本单位，所以在使用时，通常把该值除以一百
	private Integer dealPrice;//成交金额，单位为“元”，为了一目了然，通常以“万元”为成交金额的单位，所以通常把该值除以一万
	private Integer firstBuyNum;//“买一”申请4695股，即47手
	private Float firstBuyPrice;//“买一”报价；
	private Integer secondBuyNum;//买二
	private Float secondBuyPrice;//买二价格
	private Integer thirdBuyNum;//买三数量
	private Float thirdBuyPrice;//买三价格
	private Integer fourthBuyNum;//买四数量
	private Float fourthBuyPrice;//买四价格
	private Integer fifthBuyNum;//买五数量
	private Float fifthBuyPrice;//买五价格
	private Integer firstSellNum;//“买一”申请4695股，即47手
	private Float firstSellPrice;//“买一”报价；
	private Integer secondSellNum;//买二
	private Float secondSellPrice;//买二价格
	private Integer thirdSellNum;//买三数量
	private Float thirdSellPrice;//买三价格
	private Integer fourthSellNum;//买四数量
	private Float fourthSellPrice;//买四价格
	private Integer fifthSellNum;//买五数量
	private Float fifthSellPrice;//买五价格
	private Date date;//日期
	private String time;//时间
}







































































