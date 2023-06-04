package com.deval.cruddemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.deval.cruddemo.dao.StudentDAO;
import com.deval.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			//createStudent(studentDAO);
			//createMultipleStudent(studentDAO);
			//readStudent(studentDAO);
			//readAllStudent(studentDAO);
			//readAllStudentByFirstNameDesc(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			deleteALlStudent(studentDAO);
		};
	}

	private void deleteALlStudent(StudentDAO studentDAO) {
		int recordDeleted = studentDAO.deleteAll();
		System.out.println("Total recordes deleted : " + recordDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		studentDAO.delete(1);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		Student student = studentDAO.findById(1);
		student.setFirstName("batman");
		studentDAO.update(student);
	}

	private void readAllStudentByFirstNameDesc(StudentDAO studentDAO) {
		List<Student> studentList = studentDAO.sortByFirstName();
		studentList.forEach(data -> System.out.println(data));
	}

	private void readAllStudent(StudentDAO studentDAO) {
		List<Student> studentList = studentDAO.findAll();
		studentList.forEach(data -> System.out.println(data));
	}

	private void readStudent(StudentDAO studentDAO) {
		Student student = studentDAO.findById(1);
		if(student != null){
			System.out.println("Student Found");
		}else{
			System.out.println("Student not present");
		}
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Creating a student");
		Student student = new Student("deval1","seth1","devalseth@gmail.com");
		Student student2 = new Student("somel1","seth2","somelseth@gmail.com");
		Student student3 = new Student("rishi1","seth3","rishiseth@gmail.com");

		System.out.println("Saving a 3 studentw");
		studentDAO.save(student);
		studentDAO.save(student2);
		studentDAO.save(student3);

		System.out.println("Student saved");
	}
	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating a student");
		Student student = new Student("deval","seth","devalseth@gmail.com");

		System.out.println("Saving a student");
		studentDAO.save(student);

		System.out.println("Student id is : " + student.getId());
	}

}
