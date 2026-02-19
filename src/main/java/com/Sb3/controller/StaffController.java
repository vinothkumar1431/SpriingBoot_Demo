package com.Sb3.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sb3.model.Staff;
import com.Sb3.service.StaffService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api")
public class StaffController {
	
	@Autowired
	StaffService service;
	
	@GetMapping("/staff")
	public List<Staff> getAllStaff(){
		return service.getAllStaff();
	}
	
	@PostMapping("/staff")
	public String addStaff(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("Dept") String Dept) {
		service.addStaff(id,name,Dept);
		return "Staff id is : "+id+" name is : "+name+" Added Successfully ";
	}

}
