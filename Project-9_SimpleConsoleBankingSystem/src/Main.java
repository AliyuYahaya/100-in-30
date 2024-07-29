import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        System.out.println("=============================================");
        System.out.println("Welcome to Java Simple Console Banking System");
        System.out.println("=============================================");
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to do ?: ");
        System.out.println("1) Deposit Money");
        System.out.println("2) Withdraw Money");
        System.out.println("3) Check Balance");
        System.out.println("4) Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                balance();
                break;
            case 4:
                System.out.println("Goodbye!");
        }

    }
    public static void deposit() {
        double amount = client.getBalance();
        Scanner dep = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        amount = amount + dep.nextDouble();
        client.setDeposit(amount);
        System.out.println("Deposited " + amount + " to the bank");
        menu();
    }
    public static void withdraw() {
        double amount = client.getBalance();
        Scanner with = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        amount = amount - with.nextDouble();
        if (amount < 0) {
            System.out.println("Insufficient balance");
        } else {
            client.setWithdrawals(amount);
            System.out.println("Withdrew " + amount + " from the bank");
        }
        menu();
    }
    public static void balance() {
        double amount = client.getBalance();
        System.out.println("Your balance is " + amount);
        menu();
    }
}

