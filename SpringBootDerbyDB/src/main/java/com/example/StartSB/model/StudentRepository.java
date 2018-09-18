package com.example.StartSB.model;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {  //-->> Now it is my Custom Repository of Student class

}
