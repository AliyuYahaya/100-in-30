import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("Enter 1 to calculate the factorial of a number or press 0 to exit");
        int choice = sc.nextInt();
        while (choice == 1) {
            System.out.println("Enter the number to calculate the factorial");
            int number = sc.nextInt();
            calculateFactorial(number);
            System.out.println("Enter 1 to calculate the factorial of a number or press 0 to exit");
            choice = sc.nextInt();
        }

    }
    public static void calculateFactorial(int number) {
        int factorialNumber = number;
        for (int i = 1; i < number; i++) {
            factorialNumber = factorialNumber * i;
        }
        System.out.println(factorialNumber);
    }
}