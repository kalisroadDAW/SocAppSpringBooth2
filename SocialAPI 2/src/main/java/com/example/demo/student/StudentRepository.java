package com.example.demo.student;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface StudentRepository extends CrudRepository<Student, String> {
	   public Optional<Student> findById(String id);


}
