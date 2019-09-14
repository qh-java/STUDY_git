package com.study.qh.base;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public abstract class AbstractMessageListenerImpl implements MessageListener {


    public  abstract void  doProcess(String jsonStr);

    @Override
    public void onMessage(Message message){
         if(message == null){
             return ;
         }
    }

    protected  String getStrMessage(Message message){
        String result = "";
        if(message instanceof TextMessage){
            TextMessage mes = (TextMessage)message;
            try {
                result = mes.getText();
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }else{

        }
        return result;
    }
}
