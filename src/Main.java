import model.Task;
import service.TaskManager;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        TaskManager taskManager = new TaskManager();
        Task task = taskManager.create(new Task());

        Task taskFromManager = taskManager.get(task.getId());

        taskFromManager.setName("New name");

        taskManager.update(taskFromManager);

        taskManager.delete(taskFromManager.getId());
    }
}
