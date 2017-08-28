package packageA;

public class Book01 {
    int a = 5;
    public static void main(String[] args){
        Book01 b = new Book01();
        StaticTest t1 = new StaticTest();
        StaticTest t2 = new StaticTest();
        System.out.println(StaticTest.number+ " "+ StaticTest.number2);
    }
}