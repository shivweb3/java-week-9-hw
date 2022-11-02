package week9;

import java.util.ArrayList;

public class Q4ArrayListColours {
    public static void main(String[] args) {
        Q4ArrayListColours obj = new Q4ArrayListColours();
        obj.colourArrayList();
    }

    public void colourArrayList() {
        ArrayList<String> colour = new ArrayList();
        colour.add("Red");
        colour.add("Green");
        colour.add("Orange");
        colour.add("White");
        colour.add("Blue");
        colour.add("Yellow");

        for (String col : colour) {
            System.out.println(col);
        }
    }
}
