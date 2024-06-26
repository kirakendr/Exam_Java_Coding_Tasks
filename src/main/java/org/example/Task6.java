package org.example;
/* Create a method to count how many vowels are present in a string “documentation”*/
public class Task6 {
    static int isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return 1;
        else
            return 0;
    }
    static int countVowels(String str, int n) {
        if (n == 1) return isVowel(str.charAt(n - 1));
        return countVowels(str, n - 1) + isVowel(str.charAt(n - 1));
    }
    public static void main(String args[]) {
        String str = "documentation";
        System.out.print("Total number of Vowel = " + countVowels(str, str.length()));
    }
}
