package pwabd.studentispring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pwabd.studentispring.model.Student;
import pwabd.studentispring.repository.StudentRepository;

@RestController
@RequestMapping(value = "/StudentiWebJson")
public class StudentRestController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentRestController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping(value = "/GetListaStudenti")
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @GetMapping(value = "/GetStudentById/{id}")
    public Student getStudent(@PathVariable("id") Integer id) {
        return studentRepository.findOne(id);
    }

    @PostMapping(value = "/AdaugaStudent")
    public Student persist(@RequestBody final Student Student) {
        return studentRepository.save(Student);
    }

    @PutMapping(value = "/ActualizeazaStudent")
    public Student update(@RequestBody final Student Student) {
        return studentRepository.save(Student);
    }

    @DeleteMapping(value = "/StergeStudentById/{id}")
    public void deleteStudent(@PathVariable("id") Integer id) {
        studentRepository.delete(id);
    }
}