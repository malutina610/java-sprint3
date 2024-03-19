import model.Task;
import service.TaskManager;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager(scanner);

        String command = "";
        while (!command.equals("13")){
            printMenu();

            command = scanner.next();
            if (command.equals("1")) {
                Task task = taskManager.create(new Task("Новая задача"));
                System.out.println(" Создана задача: " + task);
            } else if (command.equals("2")) {
                Task task = 1;
                Task taskFromManager = taskManager.get(task.getId());
                System.out.println(" Get task: " + taskFromManager);
            } else if (command.equals("3")) {

            } else if (command.equals("13")) {
                System.out.println("До встречи !!!");
                scanner.close();
            } else {
                System.out.println("Ты наверное ошибся, такой команды нет, попробуй еще раз: введи 1-13");
            }
        }


        Task task = taskManager.create(new Task("Новая задача"));
        System.out.println(" Create task: " + task);

        Task taskFromManager = taskManager.get(task.getId());
        System.out.println(" Get task: " + taskFromManager);

        taskFromManager.setName("New name");
        taskManager.update(taskFromManager);
        System.out.println(" Update task: " + taskFromManager);

        taskManager.delete(taskFromManager.getId());
        System.out.println(" Delete task: " + task);

    }
    static void printMenu() {
        System.out.println("Создадим список задач где: 1 - Ввести новую задачу ; ");
        System.out.println("                           2 - Получить список задач;");
        System.out.println("                           3 - Изменить существующую задачу; ");
        System.out.println("                           4 - Удалить задачу; ");

        System.out.println("                           5 - Вести подзадачу; ");
        System.out.println("                           6 - Изменить подзадачу ");
        System.out.println("                           7 - Удалить подзадачу; ");
        System.out.println("                           8 - Получить список подзадач; ");

        System.out.println("                           9 - Вести задачу подзадачи; ");
        System.out.println("                           10 - Изменить задачу подзадачи ");
        System.out.println("                           11 - Удалить задачу подзадачу; ");
        System.out.println("                           12 - Удалить задачу; ");

        System.out.println("                           13 - Выйти; ");

    }
}
