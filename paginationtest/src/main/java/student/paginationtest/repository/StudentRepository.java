package student.paginationtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student.paginationtest.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity , Integer> {
}
