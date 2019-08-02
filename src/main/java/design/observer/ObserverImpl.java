package design.observer;

public class ObserverImpl implements Observer {
    private String name;
    private String message;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String s) {
        this.message = s;
        read();
    }

    private void read() {
        System.out.println(name + "收到更新消息： " + this.message);
    }
}
