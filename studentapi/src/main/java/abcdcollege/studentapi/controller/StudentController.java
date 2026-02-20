package abcdcollege.studentapi.controller;

import abcdcollege.studentapi.service.StudentService;
import com.swaggerexample.Swaggerex.api.StudentApi;
import com.swaggerexample.Swaggerex.model.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class StudentController implements StudentApi {

    @Autowired
    private final StudentService studentService;

    @Override
    public ResponseEntity<String> addStudent(StudentDTO studentDTO) {
        return studentService.addStudent(studentDTO);
    }
}
