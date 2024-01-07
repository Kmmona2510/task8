package task8;

import java.util.Scanner;

public class Qfive {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a value:");
		int num =sc.nextInt();
		int m,p=0;
		m=num/2;
		if(num==0 || num==1) {
			System.out.println(num +"Not a prime number");
					}
		for(int i=2;i<=m;i++) {
			if(num%2==0) {
				System.out.println(num +"Not a prime number");
				p=1;
				break;
			}
			if(p==0) {
				System.out.println(num + "prime number");
			}
			break;
		}

	}

}
