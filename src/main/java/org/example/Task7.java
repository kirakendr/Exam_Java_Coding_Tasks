package org.example;
/*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.*/
public class Task7 {
    public static void main(String[] args) {
        String str = "I love Java, but sometimes it makes me want to cry";
        String [] splitted = str.split(" ");
        System.out.println(splitted.length);
    }
}
