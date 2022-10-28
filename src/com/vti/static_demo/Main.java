package com.vti.static_demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thêm học sinh thứ nhất:");
        Student student1 = new Student(1, "a");
        Student student2 = new Student(2, "b");
        Student student3 = new Student(3, "c");
        Student student4 = new Student(4, "d");
        Student student5 = new Student(5, "e");

        System.out.println("Sỹ số lớp = " + Student.sySoLop);
    }
}
