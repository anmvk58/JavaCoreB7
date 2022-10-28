package static_question;

public class Student {
    int id;
    String name;
    static String college;
    static int moneyGroup = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        //Khởi tạo ra 1 học sinh thì tăng quỹ lên 100k
        moneyGroup += 100;
    }

    public void layTienQuy(int amount){
        moneyGroup = moneyGroup - amount;
        System.out.println("\nHọc sinh " + name + " đã sử dụng " + amount + "k của quỹ");
    }

    public void nopTienQuy(int amount){
        moneyGroup = moneyGroup + amount;
        System.out.println("\nHọc sinh " + name + " đã nộp vào quỹ " + amount + "k");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    public static void inTienQuyHienTai(){
        System.out.println("Tiền Quỹ Hiện tại = " + moneyGroup);
    }
}
