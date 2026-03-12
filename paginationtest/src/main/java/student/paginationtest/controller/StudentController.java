package student.paginationtest.controller;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import student.paginationtest.dto.StudentDTO;
import student.paginationtest.entity.StudentEntity;
import student.paginationtest.service.StudentService;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentDTO studentDTO){
        return studentService.addStudent(studentDTO);
    }

    @GetMapping("/get/{id}")
    public StudentDTO getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

    @GetMapping("/getallstudents")
    public List<StudentEntity> getAllStudents(@RequestParam(defaultValue = "0") int pageNumber,
                                              @RequestParam(defaultValue = "5") int pageSize){

        return studentService.getAllStudents(PageRequest.of(pageNumber,pageSize));

    }

}
