package com.vk.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vk.student.dal.entities.Student;
import com.vk.student.dal.repository.StudentRepository;

@SpringBootTest
class StudentDalApplicationTests {
	/**
	 * dependency injection to get the StudentRepository objects
	 * so that we can make the  crud operation
	 */
	@Autowired
 private StudentRepository repos;
	/**
	 * Test for Insert the data into the student table
	 */
	@Test
    public void testCreateStudent() {
    	 Student student=new Student();
    	 student.setName("Stayin hukins");
    	 student.setCourse("Webservices");
    	 student.setFees(11000.400);
    	 repos.save(student);
    }
	@Test
	public void testReadStudentById() {
		Optional<Student> studentOptional=repos.findById(11);
		if (studentOptional.isPresent()) {
			Student student=studentOptional.get();
			System.out.println(student);
		}else {
			System.out.println("student id is not matching with data base table..");
		}
	}
	@Test
	public void testUpdateStudent() {
		Optional<Student> studentOptional=repos.findById(1);
		if (studentOptional.isPresent()) {
			Student student=studentOptional.get();
			student.setCourse("hibernate");
			repos.save(student);
		}else {
			System.out.println("student id is not matching with data base table..");
		}
	}
	@Test
	public void testDeleteStudent() {
		repos.deleteById(3);
		System.out.println("student 1 is deleted succesfully");
	}
}
