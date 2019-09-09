package com.qh.study.dao.impl;

import com.qh.study.bean.Ord;
import com.qh.study.bean.Ordi;
import com.qh.study.dao.OrderDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private SqlSession sqlSession;


    public void insertOrdInfo(Ord ord) {
       try{
           sqlSession.insert("order.insertOrdInfo",ord);
       }catch(Exception ex){

       }finally{

       }
    }

    public void insertOrdiInfo(Ordi ordi) {
        try{
            sqlSession.insert("order.insertOrdInfo",ordi);
        }catch(Exception ex){

        }finally{

        }
    }
}
