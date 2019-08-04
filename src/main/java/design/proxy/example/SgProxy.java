package design.proxy.example;

public class SgProxy implements Specialty {
    private WySpecialty wySpecialty;
    @Override
    public void display() {
        if (wySpecialty == null) {
            wySpecialty = new WySpecialty();
        }
        preRequset();
        wySpecialty.display();
        postRequset();
    }
    private void preRequset(){
        System.out.println("韶关代理特产开始");
    }
    private void postRequset(){
        System.out.println("韶关代理特产结束");
    }
}
