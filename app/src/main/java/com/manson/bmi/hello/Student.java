package com.manson.bmi.hello;

public class Student {

    String id;
    String name;
    int math;
    int english;

    public Student(String id, String name, int math, int english) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public void print(){
        System.out.println(id + "\t" + name + "\t" + math + "\t" + english );
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
