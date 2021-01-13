package com.ganguixu.service;

public class loginService {

    public String loginCheck(String uname,String upass){

        System.out.println("service类执行了");
        return null ;
    }

    public void login(String uname , String upass){

        System.out.println(uname+"+++"+upass);
    }
}
