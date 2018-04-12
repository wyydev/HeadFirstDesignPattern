package com.android.hboxs020.headfirstdesignpattern.test05;

/**
 * 懒汉式
 *
 * 非线程安全（不支持多线程）
 *
 * Created by hboxs020 on 2018/4/12.
 */

public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }


}
