package com.tmcoder.service;

import java.util.List;
import com.tmcoder.entity.Student;
import com.tmcoder.entity.StudentSkill;

public interface StudentService {
	public List<Student> findAllStudents();

	public Student getStudent(int studentId);

	public void addStudent(Student stu);

	public void deleteStudent(int studentId);

	public Student addSkill(int studentId ,StudentSkill studentSkill);

	public List<Student> findStudentsByName(String name);
}
