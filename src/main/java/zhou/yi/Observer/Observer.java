package zhou.yi.Observer;

/**
 * @Author: XiaoLang
 * @Date: 2019/2/20 17:42
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
