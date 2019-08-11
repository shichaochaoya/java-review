package test;

public class EquleTest {
    public static void main(String[] args) {
        Integer i = 1;
        Integer i1 = 1;
/*        System.out.println(i.equals(i1));
        System.out.println(i == i1);*/
        Peach p1 = new Peach();
        Peach p2 = new Peach();
/*        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));*/

        String a = new String("aa");
        String b = new String("aa");
        String aa = "aa";
        String bb = "aa";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));

    }
}
