package com.st.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.pojo.Student;
import com.st.repo.Srepo;
@Service
public class ServiceStudent implements StudentService {
@Autowired
private Srepo repo;
	@Override
	public Student saveStudent(Student student) {
		int tot=0;
		tot=student.getSub1()+ student.getSub2()+student.getSub3();
		double per=((double)tot/300)*100;
		if(per>=70) {
			student.setGrade("A");
			
		}
		else if(per>=60) {
			student.setGrade("B");
			
			
		}
		else if(per>=50) {
			student.setGrade("C");
			
		}
		else {
			student.setGrade("Fail");
		
		}
		student.setTotal(tot);
		student.setPercentage(per);
		
		Student s=repo.save(student);
		return s;
	}

	@Override
	public Student updateStudent(Student student, int sid) {
		int tot=0;
		tot=student.getSub1()+ student.getSub2()+student.getSub3();
		double per=((double)tot/300)*100;
		if(per>=70) {
			student.setGrade("A");
			
		}
		else if(per>=60) {
			student.setGrade("B");
			
			
		}
		else if(per>=50) {
			student.setGrade("C");
			
		}
		else {
			student.setGrade("Fail");
		
		}
		student.setTotal(tot);
		student.setPercentage(per);
		
		Student s=repo.save(student);
		return s;
		
		
	}

	@Override
	public void deleteStudent(int sid) {
		repo.deleteById(sid);
	}

	@Override
	public Student getStudent(int sid) {
		Student get=repo.findById(sid).get();
		return get;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> list=(List<Student>) repo.findAll();
		return list;
	}

}
