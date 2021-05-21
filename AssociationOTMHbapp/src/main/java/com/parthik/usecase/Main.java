package com.parthik.usecase;



import org.hibernate.Session;


import com.parthik.beans.Department;
import com.parthik.beans.Employee;
import com.parthik.util.SessionUtil;

public class Main {

	
	public static void main(String[] args) {
		
		Session ses = SessionUtil.getSession();
		
		
		
		//for access the data from database
		
//		Department dept = ses.get(Department.class, 1);
//		dept.getEmployees().forEach(e->{
//			System.out.println(e);
//		});
//		
		
		//=======================================================
		//update or add new Employe
		Department dept = ses.get(Department.class, 1);
		
		Employee emp = new Employee();
		emp.setName("Jal");
		emp.setSalary(15000);
		
		
		
		ses.getTransaction().begin();
		dept.getEmployees().add(emp);
		ses.getTransaction().commit();
		
		
		
		
		
		
		
		//===============================================
		//for storing
		  
//		Department dept = new Department();
//		dept.setDname("Computer Engineering");
//		dept.setLocation("Gandhinagar");
//		
//		Employee emp1 = new Employee();
//		emp1.setName("Parthik");
//		emp1.setSalary(10800);
//		
//		Employee emp2 = new Employee();
//		emp2.setName("Shubham");
//		emp2.setSalary(34000);
//		
//		Employee emp3 = new Employee();
//		emp3.setName("Rajesh");
//		emp3.setSalary(40000);
//		
//		dept.getEmployees().add(emp1);
//		dept.getEmployees().add(emp2);
//		dept.getEmployees().add(emp3);
//		
//		
//		ses.getTransaction().begin();
		
////		ses.save(emp1);
////		ses.save(emp2);
////		ses.save(emp3);
//		ses.save(dept);
//		
//		ses.getTransaction().commit();
//		
		System.out.println("done");
	}
	
}
