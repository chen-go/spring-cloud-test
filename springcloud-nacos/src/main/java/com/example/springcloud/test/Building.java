package com.example.springcloud.test;

import java.util.ArrayList;
import java.util.List;

public class Building implements Subject{
    List<Observer> obses = new ArrayList<>();

    @Override
    public void reg(Observer observer) {
        obses.add(observer);
    }

    @Override
    public void unreg(Observer observer) {
        if (!obses.isEmpty()&&obses.contains(observer)){
            obses.remove(observer);
        }
    }

    @Override
    public void sendmessage(String msg) {
        for (Observer obs : obses) {
            obs.update("某个售楼小姐姐" + msg);
        }
    }
}
