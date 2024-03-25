package spring.java_lab7a.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.java_lab7a.Model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}