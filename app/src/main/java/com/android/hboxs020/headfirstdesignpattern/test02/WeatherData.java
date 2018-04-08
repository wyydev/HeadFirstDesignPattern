package com.android.hboxs020.headfirstdesignpattern.test02;

import java.util.ArrayList;

/**
 * 被观察的具体主题---气候
 *
 * Created by hboxs020 on 2018/4/8.
 */

public class WeatherData implements Subject {
    private Weather mWeather;

    private ArrayList<Observer> mObservers;

    private WeatherData() {
        mObservers = new ArrayList<>();
        mWeather = new Weather(0,0,0);
    }

    private static class WeatherDataHolder{
        private static final WeatherData instance = new WeatherData();
    }

    public static WeatherData getInstance(){
        return  WeatherDataHolder.instance;
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = mObservers.indexOf(observer);
        if (i >= 0){
            mObservers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:mObservers){
            observer.update(mWeather);
        }
    }

    public void setMeasurements(Weather weather){
        this.mWeather = weather;
        notifyObservers();
    }
}
