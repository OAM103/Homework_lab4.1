package com.metanit.Ex3;

public class Main {
    public static void main( String[] args ) {
        Person person1 = new Person();
        Person person2 = new Person(18,"Nastya");

        person1.move();
        person1.move();
        person2.talk();
        person2.talk();
    }
}
