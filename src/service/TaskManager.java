package service;

import model.Epic;
import model.SubTask;
import model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    HashMap<Integer, Task> tasks;
    HashMap<Integer, Epic> epics;
    int seq = 0;
    private int generateId(){
        return ++seq;
    }
    public TaskManager(Scanner scanner) {
        this.tasks = new HashMap<>();
    }

    public Task create(Task task) {
        task.setId(generateId());
        tasks.put(task.getId(), task);
        return task;
    }

    public Task get(int id) {
        return tasks.get(id);
    }

    // update каждому свой
    //epic приходит со статусом
    public void update(Task task) {
        tasks.put(task.getId(), task);// для epic так нельзя
    }

    //статус епика можно не рассчитывать
    // его сттус зависит от подчадач
    public void updateEpic(Epic epic){
    //    Epic saved = epics.get(epic.getId());
    //    epic.setStatus(saved.getStatus());
    //    epic.setSubTasks(saved.getSubTasks());
    //  ------------------
        Epic saved = epics.get(epic.getId());
        saved.setName(epic.getName());
    }

    public void updateSubTask(SubTask subTask){
         Epic epic = subTask.getEpic();
         Epic savedEpic =  epics.get(epic.getId());
         // один из двух методов выбрать
        /// calculateEpicStatus(savedEpic);
        /// savedEpic.calculateEpicStatus(savedEpic);

    }
    // напечатать таски
    public  List<Task> getAll(){
        return new ArrayList<>(tasks.values());

    }

    public void delete(int id) {
        tasks.remove(id);
    }
}
