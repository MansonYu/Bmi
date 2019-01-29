package com.manson.bmi;

import com.manson.bmi.hello.Person;
import com.manson.bmi.hello.Student;

public class Tester {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        Person person = new Person();
//        person.hello();
//        person.hello("Manson");
//        person.setWeight(72f);
//        person.setHeight(1.78f);
//        System.out.println(person.bmi());

        Student student1 = new Student("001", "Manson", 80, 90);
        student1.print();
    }
}
