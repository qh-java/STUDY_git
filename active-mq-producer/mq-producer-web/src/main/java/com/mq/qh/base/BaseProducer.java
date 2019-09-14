package com.mq.qh.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

public abstract class BaseProducer {

    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMsg(final String jsonMsg){
        jmsTemplate.send(new MessageCreator(){
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textmsg = session.createTextMessage();
                textmsg.setText(jsonMsg);
                return textmsg;
            }
        });
    }
}
