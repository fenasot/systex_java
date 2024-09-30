package com.systex.eBiz.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.systex.eBiz.model.Student;
import com.systex.eBiz.model.StudentRepository;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepository; 
	
	@GetMapping("/student")
	public ModelAndView student() {
		Student a = new Student();
		a.setEmail("hahaha@gggggg.com");
		return new ModelAndView("student", "command", a);
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute Student student, Model model) {
		this.studentRepository.save(student);
		model.addAttribute(student);
		return "result";
	}
	
	@GetMapping("/listStudents")
	public String getAll(Model model) {
		
		List<Student> a = this.studentRepository.findAll();
		model.addAttribute("students",a);
		return "listStudents";
	}
	
	@GetMapping("/updateStudent/{id}")
	public ModelAndView upadateStudentForm(@PathVariable int id) {
		Optional<Student> result = this.studentRepository.findById(id);
		Student student = null;
		if(!result.isEmpty()) {
			student = result.get();
		}
		else {
			throw new RuntimeException("can not find student for id: " + id);
		}
		return new ModelAndView("updateStudent", "command", student);
	}
	
	@PostMapping("/updateStudent")
	public String updateStudentForm(@ModelAttribute Student student) {
		Optional<Student> check_student = this.studentRepository.findById(student.getId());
		if(!check_student.isEmpty()) {
			this.studentRepository.save(student);
		}
		return "redirect:/listStudents";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudentFrom(@PathVariable int id) {
		Optional<Student> student = this.studentRepository.findById(id);
		if(!student.isEmpty()) {
			this.studentRepository.deleteById(id);
		}
		return "redirect:/listStudents";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
