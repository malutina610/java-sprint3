import model.Task;
import service.TaskManager;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          testTask();

//        Scanner scanner = new Scanner(System.in);
//        TaskManager taskManager = new TaskManager(scanner);
//
//        String command = "";
//        String line = "";
//        String line2 = "";
//        while (!command.equals("13")){
//            printMenu();
//
//            command = scanner.nextLine();
//            if (command.equals("1")) {
//                System.out.println("Введите задачу для вашего списка задач");
//                line = scanner.nextLine();
//                if (!line.isEmpty()){
//                Task task = taskManager.create("task name", "task description");
//                String nameTask = task.getName();
//                System.out.println(" Создана новая задача: " + nameTask);
//                }
//            } else if (command.equals("2")) {
//                //taskManager.getAll();
//               // цикл
//                System.out.println(" Ваш список задач:" );
//                Integer count = taskManager.countMap();
//                for (int i = 1; i < count || i == count; i++){
//                // task.id + task.name
//                //task.getName
//                System.out.println(i +" - "+  taskManager.getAll());
//                //что ?
//                }
//                System.out.println("______________________________________");
//                System.out.println("");
//            } else if (command.equals("3")) {
//                System.out.println(" Введите номер задачи которую необходимо изменить? ");
//                line = scanner.nextLine();
//                int replaceZad = scanner.nextInt();
//
//                System.out.println(" Введите задачу");
//                line2 = scanner.nextLine();
//
//                if (!line.isEmpty()){
//                    Task task = taskManager.get(replaceZad);
//                    //какие параметры передать ?
//                  //  Task task = taskManager.update(Task(line));
//                    //taskManager.update(line2, replaceZad);
//                    System.out.println(" Задача изменена ");
//                }
//            } else if (command.equals("13")) {
//                System.out.println("До встречи !!!");
//                scanner.close();
//            } else {
//                System.out.println("Ты наверное ошибся, такой команды нет, попробуй еще раз: введи 1-13");
//            }
//        }
//
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
//
//    }
//    static void printMenu() {
//        System.out.println("Создадим список задач где: 1 - Ввести новую задачу ; ");
//        System.out.println("                           2 - Получить список задач;");
//        System.out.println("                           3 - Изменить существующую задачу; ");
//        System.out.println("                           4 - Удалить задачу; ");
//
//        System.out.println("                           5 - Ввести подзадачу; ");
//        System.out.println("                           6 - Получить список подзадач;");
//        System.out.println("                           7 - Изменить подзадачу; ");
//        System.out.println("                           8 - Удалить подзадачу; ");
//
//        System.out.println("                           9 -  Ввести задачу подзадачи; ");
//        System.out.println("                           10 - Получить список всех задач подзадач;");
//        System.out.println("                           11 - Изменить задачу подзадачи; ");
//        System.out.println("                           12 - Удалить задачу подзадачи; ");
//
//        System.out.println("                           13 - Выйти; ");

    }

    static void testTask(){
        TaskManager taskManager = new TaskManager();
        Task task1 = taskManager.create("Работа","Встать утром на работу");//createTask
        System.out.println(task1);
        Task task2 = taskManager.create("Дом","Вернуться домой");
        System.out.println(task2);
        System.out.println(taskManager.getAll());

        Task task3 = new Task("Уволиться с работы","написать заявление");// Task -тип ,task - объект
        taskManager.update(1, task3);
        // удаление зада
        // созд эпик
        // созд эпик 2
        // созд сабтакс
        // приявязать к эптк 1
        // созд сабтакс
        // привязать к эптк 2
        // вывести эпик 1
    }
}
