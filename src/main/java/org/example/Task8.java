package org.example;

import java.util.ArrayList;

/*You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case".*/
public class Task8 {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apricot");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Avocado");
        fruits.removeIf(x-> (x.charAt(0) != 'A'));
        String lastString = fruits.toString();
        System.out.println(lastString.toLowerCase());


    }
}
