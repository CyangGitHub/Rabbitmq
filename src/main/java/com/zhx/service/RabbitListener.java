package com.zhx.service;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;

/**
 * Created by Vcy on 2017/2/6.
 */
public class RabbitListener implements ChannelAwareMessageListener {
    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        String str=new String(message.getBody());
        System.out.println(message.getMessageProperties().getMessageId());
        System.out.println("Recived msg:"+str);
    }
}
