package static_question;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyễn Văn A");
        Student student2 = new Student(2, "Nguyễn Văn B");
        Student student3 = new Student(3, "Nguyễn Văn C");
        Student[] listStudents = {student1, student2, student3};

        System.out.println("Khai báo xong 3 học sinh Student 1,2,3");
        Student.inTienQuyHienTai();

        // Student 1 lấy 50k để mua bim2 và kẹo
        student1.layTienQuy(50);
        Student.inTienQuyHienTai();

        // Student 2 lấy 20k mua bánh mỳ
        student2.layTienQuy(20);
        Student.inTienQuyHienTai();

        // Student 3 lấy 150k mua đồ dùng
        student3.layTienQuy(150);
        Student.inTienQuyHienTai();

        // Cả nhóm mỗi người nộp lại vào quỹ 50k
        for(Student s : listStudents){
            s.nopTienQuy(50);
            Student.inTienQuyHienTai();
        }

    }
}
