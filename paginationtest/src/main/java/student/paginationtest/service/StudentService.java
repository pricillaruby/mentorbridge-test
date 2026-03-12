package student.paginationtest.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import student.paginationtest.dto.StudentDTO;
import student.paginationtest.entity.StudentEntity;
import student.paginationtest.repository.StudentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public String addStudent(StudentDTO studentDTO) {
        StudentEntity studentEntity = StudentEntity.builder()
                .name(studentDTO.getName())
                .age(studentDTO.getAge())
                .department(studentDTO.getDepartment()).build();

        studentRepository.save(studentEntity);

        return "Student added successfully";
    }

    public StudentDTO getStudent(int id) {
        StudentEntity studentEntity = studentRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Id not found"));

        return StudentDTO.builder()
                .id(studentEntity.getId())
                .name(studentEntity.getName())
                .age(studentEntity.getAge())
                .department(studentEntity.getDepartment()).build();

    }

    public List<StudentEntity> getAllStudents(Pageable pageable) {
        return studentRepository.findAll(pageable).getContent();
    }
}
