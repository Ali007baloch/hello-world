package io.downgoon.hello.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigExample {

	public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee wangyi = ctx.getBean("wangyi", Employee.class);
        System.out.println(wangyi);
        
        Employee zhangsan = ctx.getBean("zhangsan", Employee.class);
        System.out.println(zhangsan);
	}
	
}