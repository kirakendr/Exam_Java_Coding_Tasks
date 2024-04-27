package org.example;
/*Write a program to swap 2 String without a temporary variable*/
public class Task1 {
    public static void main(String[] args) {
        String str1 = "I like Java";
        String str2 = "I want to become a tester";
        System.out.println("String 1 before swap: " + str1 + "." + " String 2 before swap: " + str2 + ".");

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("String 1 after swap: " + str1 + "." + " String 2 after swap: " + str2 + ".");

    }

}
