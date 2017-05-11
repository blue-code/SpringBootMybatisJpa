package jpaSample;

import jpaSample.mapper.TaskMapper;
import jpaSample.model.Task;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner demo(TaskMapper taskMapper){
        return  args -> {
          taskMapper.selectAll().forEach(System.out::println);

          System.out.println("-----------------------------");
          taskMapper.search(new Task("task",null,null,false)).forEach(System.out::println);

          System.out.println("-----------------------------");
          taskMapper.search(new Task(null,"desc1",null,false)).forEach(System.out::println);
        };
    }
}