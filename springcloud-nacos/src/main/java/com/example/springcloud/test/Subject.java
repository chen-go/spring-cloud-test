package com.example.springcloud.test;

public interface Subject {
    void reg(Observer observer);
    void unreg(Observer observer);
    void sendmessage(String msg);
}
