package jpaSample.controller;

import jpaSample.model.Task;
import jpaSample.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/jpaSample/controller")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/all-tasks")
    public String allTasks(){
        return taskService.findAll().toString();
    }

    @GetMapping("/save-task")
    public String saveTasks(@RequestParam String name, @RequestParam String desc){
        Task task = new Task(name, desc, new Date(), false);
        taskService.save(task);
        return "Task saved!";
    }

    @GetMapping("/delete-task")
    public String deleteTasks(@RequestParam int id){
        taskService.delete(id);
        return "Task deleted";
    }
}