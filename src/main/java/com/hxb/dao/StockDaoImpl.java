package com.hxb.dao;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hxb.entity.Stock;
import com.hxb.utils.HttpClientUtil;
import com.hxb.utils.TimeUtil;

@Repository
public class StockDaoImpl implements StockDao{
	
	@Override
	public Stock queryStockByCode(String code) {
		Stock stock = new Stock();
		String url = "http://hq.sinajs.cn/list=" + code;
		String resultStr = HttpClientUtil.sendHttpGet(url);
		
		Map<String, String> resultMap = handler(resultStr);
		stock.setCode(resultMap.get("code"));
		stock.setSimpleName(resultMap.get("simpleName"));
		stock.setOpen(Float.parseFloat(resultMap.get("open")));
		stock.setClose(Float.parseFloat(resultMap.get("close")));
		stock.setPrice(Float.parseFloat(resultMap.get("price")));
		stock.setHigh(Float.parseFloat(resultMap.get("high")));
		stock.setLow(Float.parseFloat(resultMap.get("low")));
		stock.setBuyPrice(Float.parseFloat(resultMap.get("buyPrice")));
		stock.setSellPrice(Float.parseFloat(resultMap.get("sellPrice")));
		stock.setDealNum(Integer.parseInt(resultMap.get("dealNum")));;
		stock.setDealPrice(Float.parseFloat(resultMap.get("dealPrice")));
		stock.setFirstBuyNum(Integer.parseInt(resultMap.get("firstBuyNum")));
		stock.setFirstBuyPrice(Float.parseFloat(resultMap.get("firstBuyPrice")));
		stock.setSecondBuyNum(Integer.parseInt(resultMap.get("secondBuyNum")));
		stock.setSecondBuyPrice(Float.parseFloat(resultMap.get("secondBuyPrice")));
		stock.setThirdBuyNum(Integer.parseInt(resultMap.get("thirdBuyNum")));
		stock.setThirdBuyPrice(Float.parseFloat(resultMap.get("thirdBuyPrice")));
		stock.setFourthBuyNum(Integer.parseInt(resultMap.get("fourthBuyNum")));
		stock.setFourthBuyPrice(Float.parseFloat(resultMap.get("fourthBuyPrice")));
		stock.setFifthBuyNum(Integer.parseInt(resultMap.get("fifthBuyNum")));
		stock.setFifthBuyPrice(Float.parseFloat(resultMap.get("fifthBuyPrice")));
		stock.setFirstSellNum(Integer.parseInt(resultMap.get("firstSellNum")));
		stock.setFirstSellPrice(Float.parseFloat(resultMap.get("firstSellPrice")));
		stock.setSecondSellNum(Integer.parseInt(resultMap.get("secondSellNum")));
		stock.setSecondSellPrice(Float.parseFloat(resultMap.get("secondSellPrice")));
		stock.setThirdSellNum(Integer.parseInt(resultMap.get("thirdSellNum")));
		stock.setThirdSellPrice(Float.parseFloat(resultMap.get("thirdSellPrice")));
		stock.setFourthSellNum(Integer.parseInt(resultMap.get("fourthSellNum")));
		stock.setFourthSellPrice(Float.parseFloat(resultMap.get("fourthSellPrice")));
		stock.setFifthSellNum(Integer.parseInt(resultMap.get("fifthSellNum")));
		stock.setFifthSellPrice(Float.parseFloat(resultMap.get("fifthSellPrice")));
		stock.setDate(TimeUtil.transferToDate(resultMap.get("date"), "yyyy-MM-dd"));
		stock.setDate(TimeUtil.transferToDate(resultMap.get("time"), "HH:mm:ss"));
		return stock;
	}
	
	
	public Map<String, String> handler(String str) {
		Map<String, String> result = new HashMap<String, String>();
		String[] arr = str.split(",");
		int equalLocation = arr[0].indexOf("=");
		String stockCode = arr[0].substring(11, equalLocation);
		String stockName = arr[0].substring(equalLocation+2, arr[0].length());
		result.put("code", stockCode);
		result.put("simpleName", stockName);
		result.put("open", arr[1]);
		result.put("close", arr[2]);
		result.put("price", arr[3]);
		result.put("high", arr[4]);
		result.put("low", arr[5]);
		result.put("buyPrice", arr[6]);
		result.put("sellPrice", arr[7]);
		result.put("dealNum", arr[8]);
		result.put("dealPrice", arr[9]);
		result.put("firstBuyNum", arr[10]);
		result.put("firstBuyPrice", arr[11]);
		result.put("secondBuyNum", arr[12]);
		result.put("secondBuyPrice", arr[13]);
		result.put("thirdBuyNum", arr[14]);
		result.put("thirdBuyPrice", arr[15]);
		result.put("fourthBuyNum", arr[16]);
		result.put("fourthBuyPrice", arr[17]);
		result.put("fifthBuyNum", arr[18]);
		result.put("fifthBuyPrice", arr[19]);
		result.put("firstSellNum", arr[20]);
		result.put("firstSellPrice", arr[21]);
		result.put("secondSellNum", arr[22]);
		result.put("secondSellPrice", arr[23]);
		result.put("thirdSellNum", arr[24]);
		result.put("thirdSellPrice", arr[25]);
		result.put("fourthSellNum", arr[26]);
		result.put("fourthSellPrice", arr[27]);
		result.put("fifthSellNum", arr[28]);
		result.put("fifthSellPrice", arr[29]);
		result.put("date", arr[30]);
		result.put("time", arr[31]);
		return result;
	}
}
















































