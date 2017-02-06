package com.zhx.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2017/2/6.
 */
public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        RabbitmqService bean = (RabbitmqService)context.getBean("rabbitmqService");
        bean.sendMessage();
    }
}
