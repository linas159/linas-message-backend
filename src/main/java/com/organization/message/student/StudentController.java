package com.organization.message.student;

import com.organization.message.student.model.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {

    @Autowired
    StudentRepository repository;
    @GetMapping()
    public List<Student> all(){
        return repository.findAll();
    }

    @PostMapping
    public void save (@RequestBody Student student){repository.save(student);
    }
}
