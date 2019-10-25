package com.Sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {
    //AMQP 高级消息队列协议
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello" + new Date();
        System.out.println("Sender : " + context);
        //amqpTemplate.convertAndSend("队列名"，“消息内容”)  此处的队列名必须与创建的队列名完全一致
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
