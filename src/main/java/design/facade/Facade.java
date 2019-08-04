package design.facade;

public class Facade {
    Method1 method1= new Method1();
    Method2 method2 = new Method2();
    Method3 method3 = new Method3();
    public void method(){
        method1.method1();
        method2.method2();
        method3.method3();
    }
}
