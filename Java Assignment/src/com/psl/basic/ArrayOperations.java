package com.psl.basic;

import java.util.Scanner;

public class ArrayOperations {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter no of elements in array :");
		int size=obj.nextInt();
		int noarray[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter element "+(i+1)+" :");
			noarray[i]=obj.nextInt();
		}
		System.out.println("Element of array are ");
		for(int i=0;i<size;i++)
		{
			System.out.print(noarray[i]+" ");
		}
		int count_of_even=0;
		for(int i=0;i<size;i++)
		{
			if(noarray[i]%2==0)
			{
				count_of_even+=1;
			}
			
		}
		System.out.println("\nNo of even elements in array are "+count_of_even);
		
		for(int i=0;i<size;i++)
		{
			if(noarray[i]%2==0 && noarray[i]%5==0)
			{
				System.out.println(noarray[i]);
			}
		}
		obj.close();
	}

}
