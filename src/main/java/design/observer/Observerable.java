package design.observer;

/**
 * 被观察者接口
 * @Method addObserver : 添加观察者
 * @Method removeObserver ： 删除观察者
 * @Method notifyObserver ： 通知观察者
 * */
public interface Observerable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
