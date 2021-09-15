package com.revature.spring.data.jpa.demo.embedded;

import com.revature.spring.data.jpa.demo.embedded.entity.Guardian;
import com.revature.spring.data.jpa.demo.embedded.entity.Student;
import com.revature.spring.data.jpa.demo.embedded.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDataJpaDemoEmbeddedApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

//	@Test
//	public void saveStudent(){
//		Student student = Student.builder()
//				.firstName("Mark")
//				.lastName("Smith")
//				.emailId("mark@gmail.com")
//				.build();
//		studentRepository.save(student);
//
//
//	}

	@Test
	public void saveStudentWithGuardian(){
		Guardian guardian = Guardian.builder()
				.name("Some name")
				.email("s@gmail.com")
				.mobile("77777")
				.build();

		Student student = Student.builder()
				.firstName("Stacy")
				.lastName("Watson")
				.emailId("stacy@gmail.com")
				.guardian(guardian)
				.build();

		studentRepository.save(student);
	}

	@Test
	public void displayAllStudents() {
		List<Student> studentList = studentRepository.findAll();
		System.out.println(studentList);
	}

	@Test
	public void displayStudentByFirstName() {
		List<Student> studentList = studentRepository.findByFirstName("Mark");
		System.out.println(studentList);
	}

	@Test
	public void displayStudentByFirstNameContaining() {
		List<Student> studentList = studentRepository.findByFirstNameContaining("Ma");
		System.out.println(studentList);
	}

	@Test
	public void displayStudentBasedOnGuardianName() {
		List<Student> studentList = studentRepository.findByGuardianName("Paul");
		System.out.println(studentList);
	}

	@Test
	public void displayGetStudentByEmailAddress() {
		Student student = studentRepository.getStudentByEmailAddress("m@gmail.com");
		System.out.println(student);
	}

	@Test
	public void displayGetStudentNameByEmailAddress() {
		String name = studentRepository.getStudentFirstNameByEmailAddress("s@gmail.com");
		System.out.println(name);
	}

	@Test
	public void displayGetStudentByEmailAddressNative() {
		Student student = studentRepository.getStudentByEmailAddressNative("s@gmail.com");
		System.out.println(student);
	}

	@Test
	public void displayGetStudentByEmailAddressNativeNamedParams() {
		Student student = studentRepository.getStudentByEmailAddressNativeNamedParams("s@gmail.com");
		System.out.println(student);
	}

	@Test
	public void TestFor_updateStudentNameByEmailAddress(){
		studentRepository.updateStudentNameByEmailId(
				"Mark200",
				"m@gmail.com"
		);
	}



}
