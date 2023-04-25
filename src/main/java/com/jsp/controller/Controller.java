package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	Student std;
	@Autowired
	StudentService stds;
	@RequestMapping("/load")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("register.jsp");
		mav.addObject("std", std);
		return mav;
	}
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute Student std) {
		stds.saveEmployee(std);
		ModelAndView mav=new ModelAndView("index.jsp");
		return mav;
	}
	@RequestMapping("/view")
	public ModelAndView view() {
		List<Student> list=stds.getallDetails();
		ModelAndView mav=new ModelAndView("viewall.jsp");
		mav.addObject("l",list);
		return mav;
	}
	@RequestMapping("/updateget")
	public ModelAndView update(@RequestParam int id) {
		Student s1=stds.getDetailsById(id);
		ModelAndView mav=new ModelAndView("update.jsp");
		mav.addObject("std", s1);
		return mav;
	}
	@RequestMapping("/update")
	public ModelAndView update1(@ModelAttribute Student s) {
		stds.updateStudent(s);
		ModelAndView mav=new ModelAndView("view");
		return mav;
	}
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam int id) {
		stds.deleteStudent(id);
		ModelAndView mav=new ModelAndView("view");
		return mav;
	}
	
}
