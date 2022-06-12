package com.example.service;

import java.io.IOException;
import java.util.List;

import com.example.model.Student;

public interface StudentService {

	void studentForm(Student s);

	List<Student> listShow();

	void removeStudent(int id);

	void updateInfo(int id) throws IOException;
	void getInfo(int id);

}