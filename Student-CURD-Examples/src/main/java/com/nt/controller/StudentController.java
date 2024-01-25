package com.nt.controller;

import com.nt.payloads.*;
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


import com.nt.service.StudentService;


@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping
	public String addStudent(@RequestBody StudentRequestDto studentDto) {
		studentService.addStudent(studentDto);
		return "Student Added Successful.";
	}

	@PutMapping
	public String updateStudent(@RequestBody StudentRequestDto studentRequestDto) {
		
		studentService.updateStudent(  studentRequestDto);
		return "Update Student Form! ";
	}

	
	@DeleteMapping("/id/{id}")
	public String deleteStudent(@PathVariable int id ) {
		studentService.deleteStudent(id);
		return "Delete Student Data";
	}

	@GetMapping
     public List<StudentResponseDto> allstudent(){
    	 return studentService.allstudent();
     }
	
	@GetMapping("/id/{id}")
	public StudentResponseDto getById(@PathVariable int id) {
		return studentService.getById(id);
	}
}
