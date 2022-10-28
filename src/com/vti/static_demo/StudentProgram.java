package com.vti.static_demo;

public class StudentProgram {
    public static void main(String[] args) {
        // cách khởi tạo không dùng static
        StudentOfRailway56 s1 = new StudentOfRailway56("Hồ Diên Vinh", 30, "vinhdh@vnu.edu.vn");
        StudentOfRailway56 s2 = new StudentOfRailway56("Nguyễn Đức Chiến", 32, "chiennd@gmail.com");
        StudentOfRailway56 s3 = new StudentOfRailway56("Trịnh Bội Nghi", 34, "nghitb@hotmail.com");
        StudentOfRailway56 s4 = new StudentOfRailway56("Phùng Đức Nam", 25, "nampd@hotmail.com");

        s1.goToSchool();
        s2.goToSchool();

        StudentOfRailway56.nopHocPhi();

    }

}