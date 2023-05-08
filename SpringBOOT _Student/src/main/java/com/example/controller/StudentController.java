package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.beans.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	@PostMapping("/getStudent")
	public String getEmplpoyee(@RequestParam(value = "city") String kkk) {
		System.out.println(kkk);
		return "Hello Student";
	}

	@GetMapping("/getAllStudent")
	public List<String> getAllEmployee() {
		List<String> list = new ArrayList<>();
		list.add("Amol");
		list.add("Ayush");
		list.add("Ritesh");
		return list;
	}

	/*
	 * IND  -> MH -> Pune, Nagpur, Mumbai  
	 * IND	-> GJ -> Rajkot, Baroda, Ahmedabad 
	 * IND  -> RJ -> Jaipur 
	 * IND  -> Delhi -> null
	 */

	@GetMapping("/getIndCities")
	public Map<String, HashMap<String, List<String>>> getCities() {
		List<String> mhcity = new ArrayList<String>();
		mhcity.add("Pune");
		mhcity.add("Nagpur");
		mhcity.add("Mumbai");
		
		List<String> gjcity = new ArrayList<String>();
		gjcity.add("Rajkot");
		gjcity.add("Baroda");
		gjcity.add("Ahmedabad");
		
		List<String> rjcity = new ArrayList<String>();
		rjcity.add("Ajmer");
		rjcity.add("Jaipur");
		
		List<String> delhicity = new ArrayList<String>();
		delhicity.add(null);
		
		HashMap<String, List<String>> indstate = new HashMap<>();
		indstate.put("MH", mhcity);
		indstate.put("GJ", gjcity);
		indstate.put("RJ", rjcity);
		indstate.put("DEL", delhicity);
		
		Map<String, HashMap<String, List<String>>> country = new HashMap<String, HashMap<String, List<String>>>();
		country.put("IND", indstate);
		
		return country;
	}

	@GetMapping("/getEmp")
	public List<Student> getEmp() {
		Student student = new Student(1, "Ram", "Ayodhya", "000000000");
		Student student1 = new Student(2, "Ayush", "Pune", "000333000");
		Student student2 = new Student(3, "Darshit", "Ambegaon", "0444000000");
		Student student3 = new Student(4, "Adi", "Sinhgad", "000044400");
		List<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student1);
		list.add(student2);
		list.add(student3);
		return list;
	}
}
