package com.sony;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, String>
{
	public List<Employee> findByEpoints(int epoints);
}
