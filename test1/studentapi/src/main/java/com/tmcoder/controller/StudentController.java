package com.tmcoder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tmcoder.dto.Quote;
import com.tmcoder.entity.Student;
import com.tmcoder.entity.StudentSkill;
import com.tmcoder.openfeign.Proxy;
import com.tmcoder.service.StudentService;

@RestController
@RequestMapping("/studentapi")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@Autowired
	Proxy proxy;

	@RequestMapping(method=RequestMethod.GET , value ="/students" )
	public List<Student> findAllStudents() {
		return service.findAllStudents();
	}

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		return service.getStudent(studentId);
	}

	@PostMapping("/students")
	public Student addStudent(@RequestBody Student stu) {
		service.addStudent(stu);
		return stu;
	}

	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student stu) {
		service.addStudent(stu);
		return stu;
	}

	@DeleteMapping("/students/{studentId}")
	public String deleteStudent(@PathVariable int studentId) {
		service.deleteStudent(studentId);
		return "Deleted Student :"+ studentId;
	}

	@PostMapping("/skills/{studentId}")
	public Student addSkill(@PathVariable int studentId, @RequestBody StudentSkill studentSkill) {
		return service.addSkill(studentId, studentSkill);
		
	}
	@PostMapping("/students/{name}")
	public List<Student> findStudentsByName(@PathVariable String name) {
		return service.findStudentsByName(name);
	}
	
	@GetMapping("/quote")
	public Quote getQuote()
	{
		return proxy.getQuote();
	}
	

}
