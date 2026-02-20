package abcdcollege.studentapi.service;

import abcdcollege.studentapi.entity.StudentEntity;
import abcdcollege.studentapi.repository.StudentRepository;
import com.swaggerexample.Swaggerex.model.StudentDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public ResponseEntity<String> addStudent(StudentDTO studentDTO) {
        StudentEntity studentEntity = StudentEntity.builder()
                .name(studentDTO.getName())
                .age(studentDTO.getAge())
                .department(studentDTO.getDepartment())
                .build();

        studentRepository.save(studentEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Student Created");
    }
}
