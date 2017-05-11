package jpaSample.dao;

import jpaSample.model.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by philosophia on 10/05/2017.
 */
public interface TaskRepository extends CrudRepository<Task, Integer>{
}
