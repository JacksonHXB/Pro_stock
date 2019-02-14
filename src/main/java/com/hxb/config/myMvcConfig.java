package com.hxb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.hxb.component.LoginHandlerInterceptor;

@Configuration
public class myMvcConfig extends WebMvcConfigurerAdapter{
	
	/*浏览器访问test时，返回成功页面*/
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/test").setViewName("test");
	}
	
	//组件
	@Bean
	public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
		WebMvcConfigurerAdapter webMvcConfigurerAdapter = new WebMvcConfigurerAdapter() {
			
			/*添加视图映射*/
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				
				registry.addViewController("/").setViewName("login");
				registry.addViewController("/index.html").setViewName("login");
				//防止表单重复提交，使用视图映射
				registry.addViewController("/main.html").setViewName("main");
				
				super.addViewControllers(registry);
			}
			
			/*注册拦截器*/
			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				System.out.println("正在进行拦截器检查！");
				InterceptorRegistration addInterceptor = registry.addInterceptor(new LoginHandlerInterceptor());
				//addInterceptor.addPathPatterns("/**");
				addInterceptor.excludePathPatterns("/index.html","/","/user/login","/**");
			}
		};
		
		//禁用拦截器
		return new WebMvcConfigurerAdapter() {};
	}
}







































