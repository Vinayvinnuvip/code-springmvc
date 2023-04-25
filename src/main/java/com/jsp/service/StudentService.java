package com.jsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;
@Component
public class StudentService {
	@Autowired
	StudentDao st;
	public Student saveEmployee(Student e) {
	return st.saveEmployee(e);
	}
	public Student getDetailsById(int id) {
	return st.getDetailsById(id);
	}
	public List<Student> getallDetails() {
	return st.getallDetails();
	}
	public Student updateStudent(Student s) {
	return st.updateStudent(s);
	}
	public Student deleteStudent(int id) {
	return st.deleteStudent(id);
	}
}
