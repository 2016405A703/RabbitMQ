package com.example.demo;

import com.DemoApplication;
import com.Sender.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class Test1 {
    @Autowired
    private HelloSender sender;

    //发送单条消息
    @Test
    public void send(){
        sender.send();
    }
}
