package com.qh.study.dao.impl;

import com.qh.study.bean.Ord;
import com.qh.study.dao.OrderDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderDaoImpl implements OrderDao {

    @Autowired
    SqlSession sqlSession;


    public void insertOrdInfo(Ord ord) {
       try{
           sqlSession.insert("order.insertOrdInfo",ord);
       }catch(Exception ex){

       }finally{

       }
    }

    public void insertOrdiInfo() {

    }
}
