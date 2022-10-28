package com.vti.static_demo;

public class Student {
    private int id;
    private String name;
    public static int sySoLop = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        sySoLop++;
    }
}
