package com.example.springcloud.mapper;

import com.example.springcloud.model.LightningTestPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LightningTestMapper {

    //扣减
    Integer deduction(LightningTestPO lightningTestPO);
}
