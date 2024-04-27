package org.example;

import java.util.Scanner;

/*Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome.*/
public class Task4 {
    public static void main(String[] args) {
        String originalStr = "kayak";
        StringBuilder st = new StringBuilder(originalStr);
        st.reverse();
        String revercedStr = st.toString();
        if(originalStr.equals(revercedStr)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
