package zhou.yi.Observer;

/**
 * @Author: XiaoLang
 * @Date: 2019/2/20 17:43
 */
/* 观察者1 */
public class StatisticsDisplay implements Observer {

    public StatisticsDisplay(Subject weatherData) {
        weatherData.resisterObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
