package com.logitalprogram;

import java.util.Scanner;

public class PerfectNumber {
static int sum=0;

	public static void main(String[] args) {
		System.out.println("***********");
		Scanner sc= new Scanner(System.in);
System.out.println("Enter Number ");
int num=sc.nextInt();
for(int i=2;i<=(num/2);i++) {
	if(num%i==0) {
		sum=sum+i;
	}
}
sum=sum+1;
if(sum==num) {
	System.out.println("number are perfect");
}
else{
			System.out.println("number are Not-perfect");
	}
	}

}
