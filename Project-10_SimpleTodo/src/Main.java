import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> tasks = new ArrayList<String>();

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        System.out.println("Welcome to Simple Todo");
        menu();
    }

    public static void menu() {
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. Show all Task");
        System.out.println("4. Exit");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                Scanner add = new Scanner(System.in);
                System.out.println("Enter Task");
                String task = add.nextLine();
                addTask(task);
                menu();
                break;
            case 2:
                Scanner delete = new Scanner(System.in);
                System.out.println("Enter task to delete");
                String task2 = delete.nextLine();
                removeTask(task2);
                menu();
                break;
            case 3:
                showTasks();
                menu();
                break;
            case 4:
                System.exit(0);
        }
    }

    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }
    public static void removeTask(String task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (task.equals(tasks.get(i))) {
                tasks.remove(i);
                System.out.println("Task removed: " + task);
            }
        }
    }
    public static void showTasks() {
        for (String task : tasks) {
            int number = tasks.indexOf(task) + 1 ;
            System.out.println(number + "." + " "+ task);
        }
        System.out.println("______________________________________");
    }
}