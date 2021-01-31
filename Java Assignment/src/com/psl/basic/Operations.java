package com.psl.basic;
import java.util.*;
public class Operations {

	public static void main(String[] args) {
	/*	Scanner obj=new Scanner(System.in);
		System.out.print("Enter type of connection Domestic (d)/Commercial(c) :");
		char typ=obj.next().charAt(0);
		System.out.print("Enter no of units consumed :");
		int no_of_units=obj.nextInt();
		System.out.print("Enter a no :");
		int no=obj.nextInt();
		System.out.print("Enter gross pay :");
		int grosspay=obj.nextInt();
		System.out.print("Enter deposit amount :");
		int depositamt=obj.nextInt();
		*/
	/*	System.out.println(Operations.isPrimeNumber(no));
		System.out.println("Tax on "+grosspay+" is "+Operations.calTax(grosspay));
		System.out.println("Intrest on "+depositamt+" is :"+Operations.calInterest(depositamt));
		System.out.print(Operations.callMax(10, 20, 30)+" is highest no");
		
		Operations op=new Operations();
		op.printPrime(40);
				
		
		System.out.print(Operations.calculateProfit(20));
				System.out.print("Electricity bill for "+no_of_units+" is "+
		Operations.calculateElectricityBill(typ, no_of_units)+"Rs");
	
		System.out.print("Charges for Rs.2600 are "+Operations.calLoan(20, 'f',"Manager",2600));
		System.out.println("Charges for Rs.2000 are "+Operations.calLoan(20, 'm',"Manager",2000));
		*/
		Operations.displayMultiplicationMatrix();
	}
	static void displayMultiplicationMatrix()
	{
		for (int i=1;i<=12;i++)
			System.out.println(i+" * "+i+" = "+i*i);
	}
	static float calLoan(int age,char gender,String job,int asset) 
	{
		float charges;
		if (asset<500)
		{
			charges=0.25f*asset*0.01f;
		}
		else if (asset>=500 && asset<1500)
		{
			charges=0.50f*asset*0.01f;
		}
		else if (asset>=1500 && asset<=2500)
		{
			charges=0.75f*asset*0.01f;
		}
		else
		{
			charges=1.0f*asset*0.01f;
		}
		return charges;
	}
	static double calculateElectricityBill(char typ_of_connection ,int no_of_units)
	{
		double bill=0.0;
		if (typ_of_connection=='d')
		{
			if(no_of_units<=100)
			{
				
				if(4*no_of_units>250)
				{
					bill=4*no_of_units;
				}
				else
				{
					bill=250;
				}
			}
			else if(no_of_units>100 && no_of_units<=300)
			{
				bill=4.5*no_of_units;
				
			}
			else if (no_of_units>300 && no_of_units<500)
			{
				bill=4.75*no_of_units;
				
			}
			else
			{
				bill=5*no_of_units;
				
			}
			
		}
		else if(typ_of_connection=='c')
		{
			if(no_of_units<=100)
			{
				
				if (4.25*no_of_units>350)
					bill=4.25*no_of_units;
				else
					bill=350;
			}
			else if (no_of_units>100 && no_of_units<=300)
			{
				bill=4.75*no_of_units;
			}
			else if(no_of_units>300 && no_of_units<=500)
			{
				bill=5*no_of_units;
			}
			else
			{
				bill=5.25*no_of_units;
			}
			
		}
		return bill;
	}
	static float calculateProfit( int numAttendees) {
		float cost_of_theatre=20+numAttendees*0.5f;
		float earning_of_theatre=5*numAttendees;
		//System.out.print(cost_of_theatre+" " );
		//System.out.print(earning_of_theatre+ " ");
		float profit=earning_of_theatre-cost_of_theatre;
		return profit;
	}
	void printPrime(int maxVlaue)
	{
		for(int i=2;i<=maxVlaue;i++)
		{
			boolean st=Operations.isPrimeNumber(i);
			if(st)
				System.out.print(i+" ");
		}
	}
	static boolean isPrimeNumber( int num) 
	{
		boolean st=true;
		int i=2;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				st=false;
				break;
			}
			++i;
		}
		return st;
	}
	static double calTax(int gp) 
	{
		double tax=0.0;
		if(gp<=240)
		{
			tax=0.0;
		}
		else if(gp>240 && gp<480)
		{
			tax=0.15*gp;
		}
		else if(gp>=480)
		{
			tax=0.28*gp;
		}
		return tax;
	}
static double calInterest(int amt) 
{
	double intrest=0.0;
	if (amt <=1000)
	{
		intrest=0.04*amt;
		
	}
	else if (amt<=5000)
	{
		intrest=0.045*amt;
	}
	else
	{
		intrest=0.05*amt;
	}
	//System.out.print(intrest);
	return intrest;
}
static int callMax(int x,int y,int z)
{
	if (x>y && x>z)
	{
		return x;
	}
	else if (y>z)
	{
		return y;
	}
	else
	{
		return z;
	}
}
static boolean checkAlpha(char alph)
{
	if (alph=='A' || alph=='a' || alph=='e' || alph=='E' ||alph=='I' || alph=='i' || alph=='o'
			|| alph=='O' || alph=='U' ||alph=='u')
	{
		return true;
	}
	else
	{
		return false;
	}
	
}
}
