import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker");
        System.out.println("1. Enter a word\n2. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter a word or number: ");
                String word = sc.next();
                palindromeChecker(word);
                break;
            case 2:
                System.exit(0);
                break;
        }
    }

    public static void palindromeChecker(String word) {
        word = word.toLowerCase();
        int n = word.length();
        String invertedWord = "";
        for (int i = 0; i < n; i++) {
            invertedWord = invertedWord + word.charAt((n-1)-i);
            System.out.println(invertedWord);
        }
        if (invertedWord.equals(word)) {
            System.out.println("The word or number " + word + " is a palindrome.");
        } else {
            System.out.println("The word or number " + word + " is not a palindrome.");
        }
    }
}