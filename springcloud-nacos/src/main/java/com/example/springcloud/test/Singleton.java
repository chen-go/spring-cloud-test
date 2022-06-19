package com.example.springcloud.test;

public class Singleton {
    //私有的静态常量
    private static final Singleton INSTANCE = new Singleton();
    //私有的构造方法
    private Singleton(){
    }
    //公开的静态方法返回这一个实例对象
    public static Singleton getInstance(){
        return INSTANCE;
    }
}

