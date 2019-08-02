package design.observer;

/**
 * 抽象观察者
 * @Method update ： 更新 当被观察者调用notify方法是update会被回调
 * */
public interface Observer {
    void update(String s);
}
