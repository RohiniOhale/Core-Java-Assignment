package com.psl.basic;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		char arr[][]=new char[3][3];
		System.out.print("Enter * or 0 ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("Enter element ["+i+"]["+j+"] :");
				arr[i][j]=obj.next().charAt(0);
				
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		TicTacToe tc=new TicTacToe();
		char st=tc.findStraightOrDiagonal(arr);
		if(st=='n')
		{
			System.out.print("Match not found");
		}
		else
		{
			System.out.print(st+" is found");
		}
	
	}
char findStraightOrDiagonal(char array[][])
{
	char a='\0';
	for(int i=0;i<array.length;i++)
	{
		if(array[i][0]==array[i][1] && array[i][1]==array[i][2])
		{
			a=array[i][0];
			break;
		}
		else if(array[i][i]==array[i+1][i+1] && array[i+1][i+1]==array[i+2][i+2])
		{
			a=array[i][0];
			break;
		}
	}
	return a;
}

}

