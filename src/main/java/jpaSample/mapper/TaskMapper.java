package jpaSample.mapper;

import jpaSample.model.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;

/**
 * Created by philosophia on 11/05/2017.
 */
@Mapper
public interface TaskMapper{

    @Select("select * from task")
    Collection<Task> selectAll();


    Collection<Task> search(Task task);
}
