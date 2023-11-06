import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp 
{
    public static void main(String[] args) 
    {
        ArrayList<Task> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine();
                    taskList.add(new Task(taskDescription, false));
                    System.out.println("Task added.");
                    break;

                case 2:
                    if (taskList.isEmpty()) 
                    {
                        System.out.println("No tasks in the list.");
                    } 
                    else 
                    {
                        System.out.println("Tasks:");
                        for (int i = 0; i < taskList.size(); i++) 
                        {
                            Task task = taskList.get(i);
                            System.out.println((i + 1) + ". " + task.getDescription() + " ("
                                    + (task.isCompleted() ? "Completed" : "Incomplete") + ")");
                        }
                    }
                    break;

                case 3:
                    if (taskList.isEmpty()) 
                    {
                        System.out.println("No tasks in the list.");
                    } 
                    else 
                    {
                        System.out.print("Enter the number of the task to mark as completed: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber > 0 && taskNumber <= taskList.size()) 
                        {
                            Task task = taskList.get(taskNumber - 1);
                            task.setCompleted(true);
                            System.out.println("Task marked as completed.");
                        } 
                        else 
                        {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}