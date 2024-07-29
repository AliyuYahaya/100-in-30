import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the Calculator program. Please enter a number to begin or press '0' to exit: ");
        int number = sc.nextInt();
        if (number != 0) {
            System.out.println("Enter the second integer: ");
            int number2 = sc.nextInt();
            System.out.println("Press '1' to add \nPress '2' to subtract \nPress '3' to multiply \nPress '4' to divide \nPress '5' to exit ");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    int sum = number2 + number;
                    System.out.println("The sum of the two numbers is: " + sum);
                    break;
                case 2:
                    int difference = number2 - number;
                    System.out.println("The difference of the two numbers is: " + difference);
                    break;
                case 3:
                    int product = number * number2;
                    System.out.println("The product of the two numbers is: " + product);
                    break;
                case 4:
                    int quotient = number / number2;
                    System.out.println("The quotient of the two numbers is: " + quotient);
                    break;
                case 5:
                    System.exit(0);
            }
        }


    }
}