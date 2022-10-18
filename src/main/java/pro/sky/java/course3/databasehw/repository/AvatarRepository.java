package pro.sky.java.course3.databasehw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.java.course3.databasehw.model.Avatar;

import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {

    Optional‹Avatar› findByStudentId(Long studentId);
}
