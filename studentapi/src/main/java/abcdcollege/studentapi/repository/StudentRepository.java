package abcdcollege.studentapi.repository;

import abcdcollege.studentapi.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {
}
