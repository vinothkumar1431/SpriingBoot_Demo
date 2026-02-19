package com.Sb3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sb3.model.Staff;
import com.Sb3.repository.StaffRepo;

@Service
public class StaffService {
	
	@Autowired
	StaffRepo repo;

	public List<Staff> getAllStaff() {
		
		return repo.findAll();
	}

	public void addStaff(int id, String name, String Dept) {
		
		Staff staff = new Staff(id,name,Dept);
		repo.save(staff);
		
	}

}
