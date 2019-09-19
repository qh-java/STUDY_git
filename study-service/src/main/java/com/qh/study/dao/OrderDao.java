package com.qh.study.dao;

import com.qh.study.bean.Ord;
import com.qh.study.bean.Ordi;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {

    public void insertOrdInfo(Ord ord);

    public void insertOrdiInfo(Ordi ordi);
}
