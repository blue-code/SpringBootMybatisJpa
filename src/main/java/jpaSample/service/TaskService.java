package jpaSample.service;

import jpaSample.dao.TaskRepository;
import jpaSample.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by philosophia on 10/05/2017.
 */
@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll(){
        List<Task> tasks = new ArrayList<>();
        for (Task task: taskRepository.findAll()){
            tasks.add(task);
        }
        return tasks;
    }

    public void save(Task task){
        taskRepository.save(task);
    }

    public void delete(int id){
        taskRepository.delete(id);
    }
}
