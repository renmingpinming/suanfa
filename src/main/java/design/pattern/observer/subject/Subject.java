package design.pattern.observer.subject;

import design.pattern.observer.observer.Observer;

/**
 * @Author:XiaoLang
 * @Date:2019-08-26 07:12
 */
public interface Subject {
    public void regestObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
