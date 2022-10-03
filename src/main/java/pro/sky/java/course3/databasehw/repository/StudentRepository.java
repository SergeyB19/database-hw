package pro.sky.java.course3.databasehw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.java.course3.databasehw.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {


}
