import model.Task;
import service.TaskManager;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          testTask();
//
////        Task task = taskManager.create(new Task("Новая задача"));
////        System.out.println(" Create task: " + task);
////
////        Task taskFromManager = taskManager.get(task.getId());
////        System.out.println(" Get task: " + taskFromManager);
////
////        taskFromManager.setName("New name");
////        taskManager.update(taskFromManager);
////        System.out.println(" Update task: " + taskFromManager);
////
////        taskManager.delete(taskFromManager.getId());
////        System.out.println(" Delete task: " + task);

    }

    static void testTask(){
        TaskManager taskManager = new TaskManager();
        Task task1 = taskManager.create("Работа","Встать утром на работу");//createTask
        System.out.println("Задание 1: ");
        System.out.println(task1);
        Task task2 = taskManager.create("Дом","Вернуться домой");
        System.out.println("Задание 2: ");
        System.out.println(task2);
        Task task3 = taskManager.create("Приготовить ужин","Покушать на ночь");
        System.out.println("Задание 3: ");
        System.out.println(task3);

        System.out.println("Весь список заданий: ");
        System.out.println(taskManager.getAll());
        System.out.println("Изменили задание 1, на: ");


        Task task4 = new Task("Уволиться с работы","написать заявление");// Task -тип ,task - объект
        taskManager.update(1, task4);
        System.out.println(task4);
        Task tasManagerGet = taskManager.get(task4.getId());
        System.out.println(" Get task: " + tasManagerGet);
        tasManagerGet.setStatus("In progress");

        System.out.println("Удалили задание 3: ");
        taskManager.delete(3);
        System.out.println("Новый список заданий: ");
        System.out.println(taskManager.getAll());

        // созд эпик
        // созд эпик 2
        // созд сабтакс
        // приявязать к эптк 1
        // созд сабтакс
        // привязать к эптк 2
        // вывести эпик 1
    }
}
