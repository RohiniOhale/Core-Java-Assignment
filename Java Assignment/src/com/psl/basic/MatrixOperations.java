package com.psl.basic;

import java.util.Scanner;

public class MatrixOperations {
	public static void main(String[] args) {
		
		MatrixOperations op=new MatrixOperations();
		int mat1[][]=op.takeMatrix();
		int mat2[][]=op.takeMatrix();
		int row1=mat1.length;
		int row2=mat2.length;
		int col1=mat1[0].length;
		int col2=mat1[0].length;
		if(col1==row2)
		{
				System.out.println("Matrix 1");
			op.printMatrix(mat1);
			System.out.println("Matrix 2");
			op.printMatrix(mat2);
		
		int multiplication[][]=op.multiplyMatrix(mat1, mat2);
			op.printMatrix(multiplication);
		}
		else
		{
			System.out.print("Multiplication of matrix is not possible");
		}
	/*	if(row1==row2 && col1==col2)
		{	System.out.println("Matrix 1");
			op.printMatrix(mat1);
			System.out.println("Matrix 2");
			op.printMatrix(mat2);
			System.out.println("Addition of matrix1 and matrix 2");
			int addition_matrix[][]=op.addMatrix(mat1, mat2);
			op.printMatrix(addition_matrix);
		}
		else
			System.out.print("Rows and Columns of matrix does not match");
		System.out.print("Before transpose\n");
		op.printMatrix(mat1);
		int transpose[][]=op.transposeMatrix(mat1);
		System.out.print("After transpose\n");
		op.printMatrix(transpose);
		*/
	}
	int[][] multiplyMatrix(int matrix1[][],int matrix2[][])
	{
		int row1,col1,row2,col2;
		row1=matrix1.length;
		col1=matrix1[0].length;
		row2=matrix2.length;
		col2=matrix2[0].length;
		
		int multiplication[][]=new int[row1][col2];
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col2;j++)
			{
				for(int k=0;k<row2;k++)
				{
					multiplication[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
		
			}
		return multiplication;
	}
	int[][] addMatrix(int matrix1[][],int matrix2[][])
	{
		int rows,cols;
		rows=matrix1.length;
		cols=matrix1[0].length;
		int addition[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				addition[i][j]=matrix1[i][j]+matrix2[i][j];
				
			}
		}
		return addition;
	}
	int[][] transposeMatrix(int matrix[][])
	{
		int rows,cols;
		rows=matrix.length;
		cols=matrix[0].length;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[j][i]=matrix[i][j];
			}
		}
		
		return matrix;
	}
	int[][] takeMatrix()
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter no of rows:");
		int rows=obj.nextInt();
		System.out.print("Enter no of columns:");
		int cols=obj.nextInt();
		int matrix[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print("Enter element ["+i+"]["+j+"] :");
				matrix[i][j]=obj.nextInt();
			}
		}
		return matrix;
	}
	void printMatrix(int matrix[][])
	{
		int rows,cols;
		rows=matrix.length;
		cols=matrix[0].length;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
