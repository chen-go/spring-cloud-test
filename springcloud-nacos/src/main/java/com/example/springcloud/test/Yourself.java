package com.example.springcloud.test;

public class Yourself implements Observer{

   private String yourName;

   public Yourself(String yourName){
       this.yourName = yourName;
   }
    @Override
    public void update(String msg) {
        System.out.println(yourName+"接到"+msg);
    }
}
