package design.pattern.observer.observer;

import design.pattern.observer.subject.Subject;

/**
 * @Author:XiaoLang
 * @Date:2019-08-26 07:38
 */
public class StatisticsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.regestObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and"
        + pressure + "%pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.pressure = pressure;
        display();
    }
}
