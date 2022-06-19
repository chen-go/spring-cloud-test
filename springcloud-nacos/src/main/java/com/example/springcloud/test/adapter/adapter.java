package com.example.springcloud.test.adapter;

import javax.validation.constraints.Min;

public class adapter extends MaxV implements MinV {

    @Override
    public Integer set() {
        Integer max = MaxV.get();
        return max/5;
    }
}
