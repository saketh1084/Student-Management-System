package com.st.Service;
import java.util.*;


import com.st.pojo.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public Student updateStudent(Student student, int sid);
	public void deleteStudent(int sid);
	public Student getStudent(int sid);
	public List<Student> getAllStudent();
	 

}
