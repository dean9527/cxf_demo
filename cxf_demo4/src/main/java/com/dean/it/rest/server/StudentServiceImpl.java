package com.dean.it.rest.server;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentServiceImpl implements IStudentService {
	
	public Student getStudent(long id, String name) {
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		try {
			student.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1983-04-26"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return student;
	}

	public Student getStudent(String name) {
		Student student = new Student();
		student.setId(1L);
		student.setName(name);
		try {
			student.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1983-04-26"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return student;
	}

}
