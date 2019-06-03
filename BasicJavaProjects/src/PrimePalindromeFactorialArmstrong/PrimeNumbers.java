package PrimePalindromeFactorialArmstrong;

public class PrimeNumbers {

	public static void main(String[] args) {
		int numberToBeChecked = 7;
		int i=2;
		if(numberToBeChecked%i == 0) {
			System.out.println(numberToBeChecked + " is not a prime number");
		}
		else {
			System.out.println(numberToBeChecked + " is a prime number");
		}
	}
}
