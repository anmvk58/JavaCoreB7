package final_demo;

public final class Person {
    int id;
    String name;
    public static final double PI1 = 3.14159265358979323846;


    public final void haveBreakfast(){
        System.out.println("Đã là người thì phải ăn sáng");
    }

    public void tinhTongHaiSo(int a, int b){
        System.out.println("Tổng 2 số là = " + (a + b));
    }
}
