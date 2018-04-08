package com.android.hboxs020.headfirstdesignpattern.test02;

/**
 * Created by hboxs020 on 2018/4/8.
 */

public class Test02 {
    public static void main(String[] args) {
        WeatherData weatherData = WeatherData.getInstance();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        Weather weather = new Weather(27f,70f,85f);
        Weather weather1 = new Weather(15.3f,72.5f,88.6f);

        weatherData.setMeasurements(weather);
        weatherData.setMeasurements(weather1);

    }
}
