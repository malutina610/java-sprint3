import model.Epic;
import model.Task;
import service.TaskManager;

import java.awt.*;
import java.util.Scanner;

// Пакет модель - хранение сущностей
// Пакет менеджер - для логики работы с моделью
// Такс - список, Епик - список с подзадачами, сабэпик - подзадачи
public class Main {
    public static void main(String[] args) {
        //    testTask();   //   //27.03 закр
        TaskManager taskManager = new TaskManager();
        // Работа с тасками
        System.out.println("----------------------------------------------");
        System.out.println("Списки ");
        Task task1 = taskManager.create(new Task("Работа","Встать утром на работу"));
        System.out.println("Задание 1: ");
        System.out.println(task1);
        //  Task taskFromManager = taskManager.get(task1.getId());
        Task task2 = taskManager.create(new Task("Дом","Вернуться домой"));
        System.out.println("Задание 2: ");
        System.out.println(task2);
        Task task3 = taskManager.create(new Task("Приготовить ужин","Покушать на ночь"));
        System.out.println("Задание 3: ");
        System.out.println(task3);

        task1.setName(" С понедельника по пятницу в 8:00");
        task1.setStatus("In_progress");
       // taskFromManager.setName(" С понедельника по пятницу в 8:00");
       // taskManager.update(taskFromManager);
        taskManager.update(task1);
        System.out.println("В задании 1, изменили наименование  на:");
        System.out.println(task1);

        System.out.println("Ваш полный список заданий: ");
        System.out.println(taskManager.getAll());

        taskManager.delete(task3.getId());
        System.out.println(" Задание 3 удалено: " + task3);
        System.out.println("Новый список заданий: ");
        System.out.println(taskManager.getAll());

        // Работа с эпиками
        System.out.println("----------------------------------------------");
        System.out.println("Списки с позадачами ");
        Epic epic1 = taskManager.create(new Epic("Купить авто","Красивую машинку надо"));
        System.out.println("Задание 1: ");
        System.out.println(epic1);

        Epic epic2 = taskManager.create(new Epic("Отметить юбилей","шикарно отпраздновать"));
        System.out.println("Задание 2: ");
        System.out.println(epic2);
    }
//27.03 закр
//        static void testTask(){
//        TaskManager taskManager = new TaskManager();
//        Task task1 = taskManager.create("Работа","Встать утром на работу");//createTask
//        System.out.println("Задание 1: " + task1);
//        Task task2 = taskManager.create("Дом","Вернуться домой");
//        System.out.println("Задание 3: "+task3);//
//        Task task4 = new Task("Уволиться с работы","написать заявление");// Task -тип ,task - объект
//        taskManager.update(1, task4);
//        Task tasManagerGet = taskManager.get(task4.getId());
//        System.out.println(" Get task: " + tasManagerGet);
//        tasManagerGet.setStatus("In progress");
//        System.out.println("Удалили задание 3: ");
//        taskManager.delete(3);

//        // созд эпик
//        // созд эпик 2
//        // созд сабтакс
//        // приявязать к эптк 1
//        // созд сабтакс
//        // привязать к эптк 2
//        // вывести эпик 1
//    }
}
