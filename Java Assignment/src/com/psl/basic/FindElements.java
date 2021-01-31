package com.psl.basic;

import java.util.Scanner;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter no of elements:");
		no=obj.nextInt();
		int nos[]=new int[no];
		for(int i=0;i<nos.length;i++)
		{	
			System.out.print("Enter element "+(i+1)+" :");
		nos[i]=obj.nextInt();
		}
		System.out.print("Enter element to search :");
		int element_to_find=obj.nextInt();
		int location=FindElements.findPosition(element_to_find, nos);
		if(location==-1)
		{
			System.out.print(element_to_find+" not found");
		}
		else
		{
			System.out.print(element_to_find+" found at location "+location);
		}
	}
	static int findPosition(int num,int[] nos)
	{
		int loc=-1;
		for (int i=0;i<nos.length;i++)
		{
			if(nos[i]==num)
			{
				loc=i;
				break;
			}
		}
		return loc;
			
		
	}


}
