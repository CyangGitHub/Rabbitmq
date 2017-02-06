package com.zhx.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vcy on 2017/2/6.
 */
@Service
public class RabbitmqService {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendMessage(){
        rabbitTemplate.convertAndSend("queueTest","This is my test!");
        System.out.println("测试消息队列");
    }
}