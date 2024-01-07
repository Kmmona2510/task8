package task8;

import java.util.Scanner;

public class Qfirst {
	
	
	

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a,b,c,d values:");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d= sc.nextInt();
		
		int sum,sum1;
		
		sum=a+b;
		sum1=c+d;
		if(sum>sum1) {
			System.out.println("sum of a and b is greater then sum of c and d");
		}
		else {
			System.out.println("c and d is greater");
			
		}
		
	
		
		

	}

}
