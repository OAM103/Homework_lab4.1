package com.metanit.Ex3;

public class Person {
    String FullName;
    int Age;

    Person(int age, String name) {
        Age = age;
        FullName = name;    }
    Person() {
        Age = 0;
        FullName = null;

    }
    public void talk(){
        System.out.println("Меня зовут " + FullName);
    }
    public void move(){
        System.out.println(" Я иду домой " );
    }


}
