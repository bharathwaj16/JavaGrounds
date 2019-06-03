package PrimePalindromeFactorialArmstrong;

public class Armstrong {

	public static void main(String[] args) {
		
		int number = 153;
		int temp, rem;
		int res = 0;
		temp = number;
		
		while(number > 0) {
			rem = number%10;
			number = number/10;
			res = res + (rem*rem*rem);
		}
		
		if(res == temp) {
			System.out.println("The number" + " " + temp + " is a palindrome");
		} else {
			System.out.println("The number" + " " + temp + " is not a palindrome");
		}
	}
}
