package design.proxy;

public class RealSubject implements Subject {
    @Override
    public void requst() {
        System.out.println("访问真实主题的方法");
    }
}
