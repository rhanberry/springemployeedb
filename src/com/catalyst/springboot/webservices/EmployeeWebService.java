package com.catalyst.springboot.webservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.springboot.model.Employee;

@RestController

public class EmployeeWebService {

	private List<Employee> employees = new ArrayList<>();
	
	@RequestMapping(value="/employees", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee){
		employees.add(employee);
		System.out.println(employees.size() + " employees.");
	}

	@RequestMapping(value="/employees", method = RequestMethod.GET)
	public List<Employee> getEmployees(){
		return employees;
	}

	@RequestMapping(value="/employees/{id}", method=RequestMethod.GET)
	public Employee getEmployeeByID(@PathVariable Integer id){
		Employee e = new Employee();
		e.setEmployeeId(id);
		e.setFirstname("Turd");
		e.setLastname("Ferguson");
		return e;
	}
}
