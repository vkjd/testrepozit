package packageA;

import packageB.TestClass;

import java.util.Random;

import static java.lang.Thread.*;

public class Book01 {
    int a = 5;
    public static void main(String[] args){
        Book01 b = new Book01();
       // TestClass t = new TestClass();
        /*try{
            while(true) {
                Thread.sleep(10);
                System.out.print(new Random().nextInt(2));
                if(new Random().nextInt(10) == 1)  System.out.println("");
            }
        }catch(Exception e){}*/
        StaticTest t1 = new StaticTest();
        StaticTest t2 = new StaticTest();
        System.out.println(StaticTest.number+ " "+ StaticTest.number2);
    }
}