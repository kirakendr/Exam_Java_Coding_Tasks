package org.example;


/*Find out how many alpha characters are present in a string*/
public class Task2 {
    public static void main(String[] args) {
        String string = "HDW463729@#hjdeHUIui489302%jsUEW9IO$#@";
        System.out.println(string.replaceAll("[^A-Z]", "").length());

    }
}
