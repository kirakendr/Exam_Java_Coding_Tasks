package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*How can you remove all duplicates from ArrayList?*/
public class Task10 {
    public static void main(String[] args) {
        List <String> lis = new ArrayList<>();
        lis.add("book");
        lis.add("cup");
        lis.add("book");
        lis.add("table");
        lis.add("mug");
        lis.add("cup");
        System.out.println(new HashSet<>(lis));
    }
}
