package com.hxb.service.impl;

import java.util.HashMap;
import org.springframework.stereotype.Service;



/**
 * 初始化系统参数 
 *
 */
@Service
public class DictService {
    
    /**存放系统参数*/
    public static HashMap<String, String> dictMap = new HashMap<String, String>();
    
//    @Autowired
//    private ExDictService exDictService;
    
    public void init() {
    	System.out.println("执行了");
    }
    
    /**参数初始化工作*/
    public void start() {
        injectDictConfigByDb();
    }
    
    /**读取字典表 */
    private void injectDictConfigByDb() {
//        List<ExDict> exDictList = exDictService.findDict();
//        if(exDictList != null && exDictList.size() > 0){
//            for (ExDict exDict : exDictList) {
//                dictMap.put(exDict.getCode(), exDict.getdValue());
//            }
//        }
//        //打印map
//        HashMap<String, String> dictMap = (HashMap<String, String>) DictInit.dictMap;
//        for (HashMap.Entry<String, String> entry : dictMap.entrySet()) {  
//        	System.out.println(entry.getKey());
//        	System.out.println(entry.getValue());
//        }  
    }
}























