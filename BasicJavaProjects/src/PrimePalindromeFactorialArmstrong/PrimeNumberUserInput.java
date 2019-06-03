package PrimePalindromeFactorialArmstrong;

import java.util.Scanner;

public class PrimeNumberUserInput {

	public static void main(String[] args) {
		System.out.println("Enter the number to be checked for Prime : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i=2;
		if(number%i == 0) {
			System.out.println(number + " is not a prime number");
		}
		else {
			System.out.println(number + " is a prime number");
		}
	}
}
