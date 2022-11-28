package com.metanit.Ex7;

public class Student extends Learner {

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return "Student";
    }
}
