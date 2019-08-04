package design.proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void requst() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        before();
        realSubject.requst();
        after();
    }

    private void before() {
        System.out.println("访问真实对象前的预处理");
    }

    private void after() {
        System.out.println("访问真实对象后的处理");
    }
}
