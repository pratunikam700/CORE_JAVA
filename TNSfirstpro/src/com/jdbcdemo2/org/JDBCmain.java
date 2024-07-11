package com.jdbcdemo2.org;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JDBCmain {

	public static void main(String[] args) {
		Connection cn;
		List<Employee> empList;
		try {
				EmployeeService service=new EmployeeService();
				empList= service.getAllEmployees();
				System.out.println(empList);
				
//				Employee e=new Employee(4,"vidhya",50000,"Manager");
//				service.addEmployee(e);
				if(service)
				System.out.println("--------------------------");
				empList=service.getAllEmployees();
				System.out.println(empList);
			
		} catch ( SQLException  | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
