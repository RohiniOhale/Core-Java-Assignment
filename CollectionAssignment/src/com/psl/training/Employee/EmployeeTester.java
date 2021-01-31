package com.psl.training.Employee;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Set<Employee> ts=new TreeSet<Employee>();
	/*	for(int i=0;i<3;i++){
		Employee e=new Employee();
		System.out.print("Enter employee id :");
		int id=sc.nextInt();
		e.setEmpid(id);
		System.out.print("Enter employee name :");
		String nm=sc.next();
		e.setName(nm);
		System.out.print("Enter employee joining date(YYYY-MM-DD) :");
		String date=sc.next();
		e.setJoiningdate(Date.valueOf(date));
		ts.add(e);
		}*/
		Employee employee=new Employee();
		employee.setEmpid(101);
		employee.setName("Chinu");
		employee.setJoiningdate(Date.valueOf("2020-03-8"));
		ts.add(employee);
		Employee employee1=new Employee();
		employee1.setEmpid(100);
		employee1.setName("Dhampu");
		employee1.setJoiningdate(Date.valueOf("2020-04-3"));
		ts.add(employee1);
		
		TreeSet<Employee> ts1=new TreeSet<Employee>(new SortByJoiningDate());
		ts1.add(employee);
		ts1.add(employee1);
		System.out.println("Employees sorted by joining date");
		for (Employee i : ts1) {
			System.out.println("Employee id :"+i.getEmpid()+"\n Name :"+i.getName());
			System.out.println("Joining Date :"+i.getJoiningdate());
		}
		//sc.close();
			
		System.out.println("Employee details");
		for(Employee i:ts){
			System.out.println("Employee id :"+i.getEmpid()+"\n Name :"+i.getName());
			System.out.println("Joining Date :"+i.getJoiningdate());
		}
		
		System.out.println("Employee who joined organization before date");
		for(Employee i:ts){
			int res=i.getJoiningdate().compareTo(Date.valueOf("2020-06-2"));
			if(res<1)
			{
				System.out.println("Employee id :"+i.getEmpid()+"\n Name :"+i.getName());
				
			}	
		}
		System.out.println("Employee who completed six months in organization");
		LocalDate localdt=LocalDate.now();
		for (Employee i : ts) {
			
			LocalDate joiningdte=i.getJoiningdate().toLocalDate();
			int res=localdt.compareTo(joiningdte.plusMonths(6));
			if(res>0){
			System.out.println("Employee id :"+i.getEmpid()+"\n Name :"+i.getName());
			System.out.println("Joining Date :"+i.getJoiningdate());
			}
			
		}
		
		}
	}


