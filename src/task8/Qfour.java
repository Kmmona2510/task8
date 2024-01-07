package task8;

import java.util.Scanner;

public class Qfour {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping:" +a + "" +b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping of numbers:" +a+ "" +b);

	}

}
