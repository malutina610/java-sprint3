import model.Task;
import service.TaskManager;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        //
        TaskManager taskManager = new TaskManager();
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
}
