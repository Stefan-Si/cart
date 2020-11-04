package com.qfedu.controller;


import com.qfedu.entity.Cart;
import cou.qfedu.dto.CartAddDto;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface CartDao {
    @Select("select * from ")
    Cart queryByUid(CartAddDto dto);
}
