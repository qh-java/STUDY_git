package com.qh.study.service.impl;

import com.qh.study.bean.Ord;
import com.qh.study.bean.Ordi;
import com.qh.study.dao.OrderDao;
import com.qh.study.dto.OrderMessageBodyDTO;
import com.qh.study.dto.OrderMessageHeaderDTO;
import com.qh.study.dto.OrderMessageSendOmsqInputDTO;
import com.qh.study.service.ReceiveOrderFromB2CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class ReceiveOrderFromB2CServiceImpl implements ReceiveOrderFromB2CService {

    @Autowired
    OrderDao orderDao;

    @Override
    public void reveiveOrderInfo(OrderMessageSendOmsqInputDTO inputDTO) {
        if (null != inputDTO) {
            OrderMessageHeaderDTO dto =  inputDTO.getOrderMessageHeader();
            List<OrderMessageBodyDTO> dtos = inputDTO.getOrderMessageBody();
            if(null != dto){
                Ord ord = new Ord();
                ord.setB2cOrderId(dto.getB2cOrderId());
                ord.setOrderId(dto.getOrderId());
                orderDao.insertOrdInfo(ord);
            }
            if(!CollectionUtils.isEmpty(dtos)){
                for(OrderMessageBodyDTO body : dtos){
                    Ordi ordi = new Ordi();
                    ordi.setB2cOrderId(body.getB2cOrderId());
                    ordi.setB2cOrderItemId(body.getB2cOrderItemId());
                    ordi.setOrderId(body.getOrderId());
                    ordi.setOrderType(body.getOrderType());
                    ordi.setOrderItemId(body.getOrderItemId());
                    orderDao.insertOrdiInfo(ordi);
                }
            }
        }
    }
}
