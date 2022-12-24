package com.logitalprogram;

import java.util.Scanner;

public class VendingMachine {
	public static int inputAmount() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Total Amount :: ");
		int totalAmount=sc.nextInt();
		return totalAmount;
	}
	public static void inputNote(int amount)
	{
		int []noteS=new int[] {1000,500,100,50,10,5,2,1};
		int [] countNote= new int [8];
		int nNote=0;
		
		for(int i=0;i<noteS.length;i++) 
		{
			if(amount>=noteS[i]) 
			{
				countNote[i]=amount/noteS[i];
				amount=amount%(noteS[i]*countNote[i]);
			}
		}
		System.out.println("Amount and Its Number of Notes ");
		for(int i=0;i<noteS.length;i++)
		{
			if(countNote[i]!=0)
			{
				System.out.println("The "+noteS[i]+"Rs :: "+countNote[i]);
			}
			
		}
		for(int i=0;i<noteS.length;i++)
		{
				nNote=nNote+countNote[i];			
		}
		System.out.println("Total Minimum notes "+nNote);
	}
	
	public static void main(String[] args) {
	     inputNote(inputAmount());
	    }
}
