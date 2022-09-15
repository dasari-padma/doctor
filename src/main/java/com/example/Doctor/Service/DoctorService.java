package com.example.Doctor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Doctor.Entity.Doctor;
import com.example.Doctor.Repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository repository;
	
	public Doctor saveDoctor(Doctor doctor) {
		
		return repository.save(doctor);
	}
	
    public List<Doctor> saveDoctors(List<Doctor> doctors) {
		
		return repository.saveAll(doctors);
	}
    
    public List<Doctor> getDoctors()
    {
    	return repository.findAll();
    }
    
    public Doctor getDoctorById(int id)
    {
    	return repository.findById(id).orElse(null);
    }
    
    public Doctor getDoctorByName(String name)
    {
    	return repository.findByName(name);
    }
    
    public String deleteDoctor(int id) {
    	repository.deleteById(id);
    	return "Doctor removed";
    }
    
    

}

