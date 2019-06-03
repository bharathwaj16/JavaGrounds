package PrimePalindromeFactorialArmstrong;

public class Palindrome {

	 public static void main(String[] args) {
		
		 int number = 3434;
		 int sum = 0;
		 
		 int temp = number;
		 while(number > 0)
			 {
			 	int rem = number%10;
			 	sum = (sum*10) + rem;
			 	number = number/10;
			 }
		 if(temp==sum) {
			 System.out.println(temp + " is a palindrome");
		 }
		 else {
			 System.out.println(temp + " is not a palindrome");
		 }
		 
		 
	}
}
