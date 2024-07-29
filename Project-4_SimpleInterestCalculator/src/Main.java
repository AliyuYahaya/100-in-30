import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        interestCalculator();
    }

    public static void interestCalculator() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = in.nextInt();
        System.out.print("Enter the Principle Amount: ");
        int amount = in.nextInt();
        System.out.print("Enter the Interest Rate: ");
        double interestRate = in.nextDouble();
        int simpleInterest = (int)((amount * interestRate * years)/100);
        int total = simpleInterest + amount;
        System.out.println("Simple Interest after " + years + " years is: " + simpleInterest);
        System.out.println("And the total amount is: " + total );
    }
}