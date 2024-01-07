package task8;

import java.util.Scanner;

public class Qsix {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=num.nextInt();
		int m=1;		
		for(int i=1;i<=n;i++) {
			
			m=m*i;
			
		}
		

		System.out.println("Factorial is:" +m);

}}
