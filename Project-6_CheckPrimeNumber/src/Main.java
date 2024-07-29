import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Prime Number Checker");
        menu();
    }

    public static void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Press 1 to check prime number\nPress 2 to exit the program");
            int choice = scanner.nextInt();
            String end = "Y";
            while (Objects.equals(end, "Y")) {
                if (choice == 1) {
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    checkPrime(number);
                    System.out.println("Do you want to check another number ? (Y/N)");
                    end = scanner.next();

                } else if (choice == 2) {
                    System.exit(0);
                }
            }
        }
    }

    public static void checkPrime(int input) {

        if (isPrime(input)) {
            System.out.println(input + " is a prime number");
        } else {
            System.out.println(input + " is not a prime number");
        }
    }

    public static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}