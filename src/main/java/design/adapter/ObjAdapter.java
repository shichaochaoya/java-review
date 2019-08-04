package design.adapter;

public class ObjAdapter {
    private Adaptee adaptee;

    public ObjAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    public void request(){
        adaptee.specificRequest();
    }
}
