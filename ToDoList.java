import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tasks = new String[10];
        int count = 0;

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int opt = sc.nextInt();
            sc.nextLine(); 

            if (opt == 1) {
                if (count < tasks.length) {
                    System.out.print("Enter task: ");
                    tasks[count] = sc.nextLine();
                    count++;
                } else {
                    System.out.println("Task list is full.");
                }
            } else if (opt == 2) {
                System.out.println("Your Tasks:");
                for (int i = 0; i < count; i++) {
                    System.out.println((i + 1) + ". " + tasks[i]);
                }
            } else if (opt == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}
