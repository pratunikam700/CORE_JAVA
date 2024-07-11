package com.jdbcdemo2.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService{
  
	PreparedStatement pst;
	ResultSet rs;
	Connection cn;
	
	public EmployeeService() throws ClassNotFoundException, SQLException{
		
		cn=DButil.getcCn();
	}
	@Override
	public List<Employee> getAllEmployees() throws SQLException{
		List<Employee> empList=new ArrayList<Employee>();
		pst=cn.prepareStatement("SELECT * FROM employee");//used or dynamic execution 
		rs=pst.executeQuery();
		while(rs.next()) {
			Employee e=new Employee();
			e.setEmpId(rs.getInt(1));
			e.setEmpName(rs.getString(2));
			e.setSalary(rs.getFloat(3));
			e.setPost(rs.getString(4));
			empList.add(e);
			
		}
		return empList;
	}

	@Override
	public Employee getEmpployeeById(int empId) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void addEmployee(Employee e) throws SQLException{
		// TODO Auto-generated method stub
		String query="INSERT INTO employee VALUES(3,'Pooja',5600,'tranie')";
		pst=cn.prepareStatement("INSERT INTO employee VALUES(?,?,?,?)");
		pst.setInt(1,e.getEmpId());
		pst.setString(2,e.getEmpName());
		pst.setFloat(3,e.getSalary());
		pst.setString(4,e.getPost());
		int n=pst.executeUpdate();
		if(n>0)
			System.out.println("Record inserted successully!!");
	}

	@Override
	public boolean deleteEmployee(int empId) throws SQLException {
		// TODO Auto-generated method stub
		pst=cn.prepareStatement("DELETE FROM employee where empid=?");
		pst.setInt(1, empId);
		int n=pst.executeUpdate();
		
		return false;
	}

	@Override
	public boolean updateEmployee(int empId, Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
