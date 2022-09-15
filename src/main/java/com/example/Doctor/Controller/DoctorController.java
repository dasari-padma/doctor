package com.example.Doctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Doctor.Entity.Doctor;
import com.example.Doctor.Service.DoctorService;

@Controller
public class DoctorController {
	
	@Autowired
	private DoctorService service;
@PostMapping("/addDoctor")	
public Doctor addDoctor(@RequestBody Doctor doctors) {
		
		return service.saveDoctor(doctors);
	}
	
@PostMapping("/addDoctors")
    public List<Doctor> addDoctors(@RequestBody List<Doctor> doctor) {
		
		return service.saveDoctors(doctor);
	}

@GetMapping("/Doctors")
   public List<Doctor> findAllDoctor()
    {
    	return service.getDoctors();
    }
    
    @GetMapping("/Doctor/{id}")
    public Doctor findDoctorById(@PathVariable int id)
    {
    	return service.getDoctorById(id);
    }
    
    @GetMapping("/Doctor/{name}")
    public Doctor findStudentByName(@PathVariable String name)
    {
    	return service.getDoctorByName(name);
    }
    
    public String deleteDoctor(@PathVariable int id) {
    	return service.deleteDoctor(id);
    	
    }
    


}
