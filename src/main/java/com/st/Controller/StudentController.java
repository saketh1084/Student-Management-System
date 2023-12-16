package com.st.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.st.Service.StudentService;
import com.st.pojo.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "home";  
	}
	@RequestMapping("/addStudentDetails")
	public String Student()
	{
		return"details";
	}
	@RequestMapping("/add")
	public String save(Student student, ModelMap model)
	{
		 Student ss=service.saveStudent(student);
		return"success";

	}
	@RequestMapping("/viewAllStudents")
	public String getAll(ModelMap model)
	{
		model.put("students", service.getAllStudent());
		return "updateproduct";
	}
	@RequestMapping("/delete/{sid}")
	 public String delete(@PathVariable int sid) {
	 service.deleteStudent(sid);
	return "redirect:/ViewAllStudents";
	}
	@RequestMapping("/update/{sid}")
	public String getUpdate(ModelMap model,@PathVariable int sid)
	{
		model.put("command",service.getStudent(sid));
		return "Viewproduct";
	}
	@RequestMapping(path="/editu", method=RequestMethod.POST)
	public String updateAndSave(Student student, int sid)
	{
		service.updateStudent(student, sid);
		return "redirect:/viewAllStudents";
		
	}
	


}