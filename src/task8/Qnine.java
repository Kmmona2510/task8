package task8;

import java.util.Scanner;

public class Qnine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if(age>=60) {
			System.out.println("The person is a Senior Citizen");
		}else {
			System.out.println("The person is not a senior Citizen");
		}

	}

}
