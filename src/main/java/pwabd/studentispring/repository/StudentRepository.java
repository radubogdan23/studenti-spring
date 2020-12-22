package pwabd.studentispring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pwabd.studentispring.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}