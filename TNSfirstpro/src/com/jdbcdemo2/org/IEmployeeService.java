package com.jdbcdemo2.org;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeService {

	List<Employee> getAllEmployees() throws SQLException;
	Employee getEmpployeeById(int empId)throws SQLException;;
	void addEmployee(Employee e)throws SQLException;;
	boolean deleteEmployee(int empId)throws SQLException;;
	boolean updateEmployee(int empId,Employee e)throws SQLException;;
	
}
