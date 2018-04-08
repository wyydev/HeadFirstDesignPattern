package com.android.hboxs020.headfirstdesignpattern.test02;

/**
 * 主题
 * Created by hboxs020 on 2018/4/8.
 */

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
