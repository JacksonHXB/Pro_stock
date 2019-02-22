package com.hxb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component("BeanDefineConstant")
public class BeanDefineConfigue implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
    private DictInit dictInit;

	/*当一个ApplicationContext被初始化或刷新触发*/
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("测试");
        if (event.getApplicationContext().getParent() == null) {//root application context 没有parent，他就是老大.
            dictInit.start();
        } else {
            
        }
		
	}

}
