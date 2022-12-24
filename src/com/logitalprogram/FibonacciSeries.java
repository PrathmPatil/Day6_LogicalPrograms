package com.logitalprogram;

import java.util.Scanner;

public class FibonacciSeries {
static int a=0;
static int b=1;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter Number: ");
         int n=sc.nextInt();
         System.out.print("0, 1");
         for(int i=0;i<n;i++) {
        	 int c=a+b;
        	  a=b;
        	  b=c;
        	  System.out.print(", "+c);
         }
         
	}

}
