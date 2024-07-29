import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Celsius Converter");
        System.out.println("Enter '1' to convert Celsius to Fahrenheit\nEnter '2' to convert Fahrenheit to Celsius\nEnter '3' to quit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Celsius to convert to Fahrenheit");
                double convertToFahrenheit = sc.nextDouble();
                double Fahrenheit = convertToFahrenheit * 1.8 + 32;
                System.out.println("Fahrenheit is: " + Fahrenheit);
                break;
            case 2:
                System.out.println("Enter Fahrenheit to convert to Celsius");
                double convertToCelsius = sc.nextDouble();
                double Celsius = (convertToCelsius - 32)/1.8;
                System.out.println("Celsius is: " + Celsius);
                break;
            case 3:
                System.exit(0);

        }
    }
}
