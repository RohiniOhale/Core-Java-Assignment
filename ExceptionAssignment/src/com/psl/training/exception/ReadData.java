package com.psl.training.exception;

import java.io.File;
//import java.io.FileReader;
import java.util.Scanner;

public class ReadData {
	public static void main(String[] args) {

		try{
		File file=new File("H:\\Users\\rohini_ohale\\Desktop\\Assignments\\Core Java\\ExceptionAssignment"
				+ "\\src\\com\\psl\\training\\exception\\movies.txt");
		Scanner sc=new Scanner(file);
		int count=0;
		while(sc.hasNextLine())
		{
			if(count>=1){
				
			if(!(sc.hasNextInt()))
			{
				System.out.println("Movie id should be integer ");
			}
			
			}
			System.out.println(sc.nextLine());
			count+=1;
		
		}
		sc.close();
		}	
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
		
	
	
	
	}
}
