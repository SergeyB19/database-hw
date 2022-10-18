package pro.sky.java.course3.databasehw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pro.sky.java.course3.databasehw.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "SELECT *, FROM student", nativeQuery = true)
    Student getAllByStudents(int age);

    @Query(value = "SELECT * FROM student GROUP BY age, nativeQuery = true)
    Student findByAgeBetween(int age);

    @Query(value = "SELECT * FROM student OFFSET 5 , nativeQuery = true)
            Student findByAgeBetween(int age);

}


