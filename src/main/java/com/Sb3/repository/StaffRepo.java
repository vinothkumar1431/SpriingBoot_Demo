package com.Sb3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sb3.model.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer>{

}
