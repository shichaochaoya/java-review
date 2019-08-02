package design.observer;

public class Test {
    public static void main(String[] args) {

        ObserverImpl observer1 = new ObserverImpl("Wang");
        ObserverImpl observer2 = new ObserverImpl("Sun");
        ObserverImpl observer3 = new ObserverImpl("Li");
        ObserverImpl observer4 = new ObserverImpl("Zhang");

        ObserverableImpl wechat = new ObserverableImpl();
        wechat.addObserver(observer1);
        wechat.addObserver(observer2);
        wechat.addObserver(observer3);
        wechat.addObserver(observer4);

        wechat.setInformation("first message");

        wechat.removeObserver(observer1);

        wechat.setInformation("second message");

    }
}
