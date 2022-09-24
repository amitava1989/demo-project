package com.spring.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		
		return new Student("Amitava","Ghosh");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> st = new ArrayList<>();
		st.add(new Student("Amitava","Ghosh"));
		st.add(new Student("Nibedita","Ghosh"));
		st.add(new Student("Amitava","Ghosh"));
		st.add(new Student("Nibedita","Ghosh"));
		st.add(new Student("Nibedita","Ghosh"));
		return st;
		
	}
}
