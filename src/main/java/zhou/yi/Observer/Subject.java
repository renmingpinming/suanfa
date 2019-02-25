package zhou.yi.Observer;

/**
 * @Author: XiaoLang
 * @Date: 2019/2/20 17:42
 */
public interface Subject {
    void resisterObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
