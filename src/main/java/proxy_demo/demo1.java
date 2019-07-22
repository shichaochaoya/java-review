package proxy_demo;

import java.io.File;
import java.lang.reflect.Field;

public class demo1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        {
               Person p = new Person(1,"wang",3);
            System.out.println(p);
               Class clazz = p.getClass();
                Field field=clazz.getDeclaredField("age");
                if(field.isAccessible()){
                    System.out.println("true");
                }else{
                    System.out.println(field.isAccessible());//false
                    field.setAccessible(true);
                    field.set(p,199999999);
                    System.out.println(p.toString());//Person{name='Jack', age=199999999, sex='女'}
                }
                System.out.println(field.get(p));//199999999
                System.out.println(field.getName());//age
                System.out.println(field.getType());//class java.lang.Integer
                System.out.println(field.getDeclaringClass());//class _04Reflexing.Person
                System.out.println(field.getClass());//class java.lang.reflect.Field
        }
    }


}
