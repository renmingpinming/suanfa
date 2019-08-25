package design.pattern.observer;

import design.pattern.observer.observer.CurrentConditionDisplay;
import design.pattern.observer.observer.StatisticsDisplay;
import design.pattern.observer.subject.WeatherData;

/**
 * @Author:XiaoLang
 * @Date:2019-08-26 07:43
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurementChanged(1.2f,2.3f,4.5f);
    }
}
