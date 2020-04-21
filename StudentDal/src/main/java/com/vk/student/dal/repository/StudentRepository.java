package com.vk.student.dal.repository;

import org.springframework.data.repository.CrudRepository;

import com.vk.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
