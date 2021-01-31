package com.psl.training.Employee;

import java.sql.Date;

public class Employee implements Comparable<Employee>{
private int empid;
private String name;
private Date joiningdate;
public Employee() {
	
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public void setName(String name) {
	this.name = name;
}

public void setJoiningdate(Date joiningdate) {
	this.joiningdate = joiningdate;
}

public int getEmpid() {
	return empid;
}
public String getName() {
	return name;
}
public Date getJoiningdate() {
	return joiningdate;
}

@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	if(this.empid<o.empid)
		return	-1;
	else if(this.empid>o.empid)
		return 1;
	else
		return 0;
	
}


}
