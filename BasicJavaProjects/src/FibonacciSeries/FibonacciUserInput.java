package FibonacciSeries;

import java.util.Scanner;

public class FibonacciUserInput {

	public static void main(String[] args) {

		int a =1;
		int b=1;
		System.out.println("How many numbers to be printed? ");
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		for(int i=2; i<=numbers; i++)
		{
			int c = a+b;
			a=b; b=c;
			System.out.println(c);
		}
		
}
	
}
