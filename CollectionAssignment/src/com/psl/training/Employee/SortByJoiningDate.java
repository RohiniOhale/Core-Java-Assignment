package com.psl.training.Employee;

import java.util.Comparator;

public class SortByJoiningDate implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getJoiningdate().compareTo(o2.getJoiningdate());
	}

	

}
