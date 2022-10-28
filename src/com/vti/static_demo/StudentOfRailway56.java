package com.vti.static_demo;

public class StudentOfRailway56 {
     String name;
     int age;
     String email;
     static String mentor = "AnMV1";

    public StudentOfRailway56(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void goToSchool(){
        System.out.println("Student "+ name +" go to School");
    }

    public static void nopHocPhi(){
        System.out.println("Student "+ mentor +" cần nộp học phí đúng hạn !");
    }
}

