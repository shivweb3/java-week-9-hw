package week9;

import java.util.ArrayList;
import java.util.Iterator;

public class Q5Iterate {
    public static void main(String[] args) {
        Q5Iterate obj = new Q5Iterate();
        obj.iterateArray();
    }

    public void iterateArray(){
        ArrayList<Integer> number = new ArrayList();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);

        Iterator<Integer> inte = number.iterator();

        while (inte.hasNext()) {
            System.out.println(inte.next());
        }
    }
}
