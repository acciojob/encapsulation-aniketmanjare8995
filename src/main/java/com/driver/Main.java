package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly rwOnly= new RWOnly();
       // rwOnly.name= "Aniket";
        //'name' has private access in 'com. driver. RWOnly'

        rwOnly.setName("Aniket");
        System.out.println(rwOnly.getName());
    }
  
}