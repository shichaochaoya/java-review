package proxy_demo;

import java.sql.DatabaseMetaData;
import java.sql.Date;

public class Person {
    private int pid;
    protected String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(int pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }
}
