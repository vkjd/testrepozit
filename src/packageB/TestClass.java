package packageB;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    int a = 10;
    public TestClass(){
        System.out.println("testclass is here");
        TestClass();
    }
    public void TestClass(){

        System.out.println(a);
        int huy = 5;
        System.out.println(huy);
        System.out.println("strings");

        String string = "animals";
        System.out.println(string.substring(6,7));
        System.out.println(string.replace('a', 'A'));
        List<Integer> ints = new ArrayList<>();
        ArrayList<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("eagle");
        System.out.println(birds);
        String[] array = {"hawk", "robin"};
        List<String> list = Arrays.asList(array);
        list.set(1, "test");
        array[0] = "new";
        for(String s : array) System.out.println(s);
        for(String s : list) System.out.println(s);
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        Period p = Period.ofYears(1).ofWeeks(1);
        String stringen = "abcdef";
        stringen.charAt(6);
        List<Integer> listInts = new ArrayList<>();
        listInts.add(null);
    }
}
