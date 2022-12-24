package com.logitalprogram;
import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long start,end;
		double actualTime;
		System.out.println("Type 's' to start the stopwatch");
		char startT=sc.next().charAt(0);
		start=System.currentTimeMillis();
		System.out.println("Type 's' to stop the stopwatch");
		char stopT=sc.next().charAt(0);
		end=System.currentTimeMillis();
		actualTime=(end-start)/1000.0;
		System.out.println(actualTime);
	}

}
