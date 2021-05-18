package com.example.jpa;

import com.example.jpa.model.Courses;
import com.example.jpa.model.Students;
import com.example.jpa.repository.StudentsRepository;
import com.example.jpa.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;
/**
 * Created by Vivek Singh on 16/05/2021.
 */
@SpringBootApplication
public class JpaManyToManyDemoApplication implements CommandLineRunner {

	@Autowired
	private CoursesRepository coursesRepository;

	@Autowired
	private StudentsRepository studentsRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaManyToManyDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Students students = new Students("Vivek","Fan of John Mayer", Date.from(Instant.parse("1995-05-25T00:00:00.000Z")));
		Courses c1 = new Courses("Maths","This subject is easy");
		Courses c2 = new Courses("Maths","This subject could be tricky");
		Set<Courses> courses = new HashSet();
		courses.add(c1);
		courses.add(c2);
		students.getCourses().addAll(courses);
		studentsRepository.save(students);

	}
}
