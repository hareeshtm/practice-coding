package com.tmcoder.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmcoder.dao.SkillRepo;
import com.tmcoder.dao.StudentRepo;
import com.tmcoder.entity.Student;
import com.tmcoder.entity.StudentSkill;
import com.tmcoder.exception.StudentNotFound;
import com.tmcoder.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo studentRepo;
	@Autowired
	SkillRepo skillRepo;

	@Override
	public List<Student> findAllStudents() {

		return studentRepo.findAll();
	}

	@Override
	public Student getStudent(int studentId) {

		Optional<Student> op = studentRepo.findById(studentId);
		Student s = new Student();
		if (op.isPresent()) {
			s = op.get();
		} else {
			throw new StudentNotFound("Student ID: " + studentId + " not found");
		}
		return s;
	}

	@Override
	public void addStudent(Student stu) {
		if(stu.getId()!=0)
		{
			System.err.println(stu.getId());
			Optional<Student> op = studentRepo.findById(stu.getId());
			if(op.isPresent())
			{
				System.err.println("inside if");
				throw new StudentNotFound("Student ID: " + stu.getId() + " is already present");
			}
				
		}
		studentRepo.save(stu);
	}

	@Override
	public void deleteStudent(int studentId) {

		Student s = getStudent(studentId);
		studentRepo.deleteById(s.getId());
	}

	@Override
	public Student addSkill(int studentId, StudentSkill studentSkill) {

		Student s = getStudent(studentId);
		studentSkill.setS(s);
		skillRepo.save(studentSkill);
		return s;

	}

	@Override
	public List<Student> findStudentsByName(String name) {
		List <Student> students=studentRepo.findStudentByName(name);
		return students;
	}

}
