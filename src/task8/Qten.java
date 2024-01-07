package task8;

import java.util.Scanner;

public class Qten {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int num1=sc.nextInt();
		
		int num=0;
		while(num1 != 0) {
			num1 /= 10;
			++num;
		}
		System.out.println("The count number is:" +num);

	}

}
