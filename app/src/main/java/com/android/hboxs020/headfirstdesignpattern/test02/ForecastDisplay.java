package com.android.hboxs020.headfirstdesignpattern.test02;

/**
 * 预测布告板
 *
 * Created by hboxs020 on 2018/4/8.
 */

public class ForecastDisplay implements Observer,DisplayElement{
    private Subject weatherData;
    private Weather mWeather;
    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(Weather weather) {
        mWeather = weather;
        display();
    }

    @Override
    public void display() {
        System.out.println("temp:"+mWeather.getTemp()+"   humidity:"+mWeather.getHumidity()+"     pressure:"+mWeather.getPressure());
    }
}
