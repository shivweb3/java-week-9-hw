package week9;

import java.util.ArrayList;

public class Q6Retrieve_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        a.add(111);
        a.add(222);
        a.add(333);
        a.add(444);
        a.add(555);
        a.add(666);

        System.out.println(a);

        Integer b = a.get(0);
        System.out.println("First element is  " + b);
        b = a.get(1);
        System.out.println("Second element is " + b);
        b = a.get(5);
        System.out.println("Sixth element is "+b);
    }
}
