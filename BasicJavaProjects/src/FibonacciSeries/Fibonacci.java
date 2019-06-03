package FibonacciSeries;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a =1;
		int b =1;
		int number = 10;
	
		System.out.println("The fibonacci series for 10 numbers is : ");
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2; i<=number; i++) 
		{
			int c = a+b;
			a=b; b=c;
			System.out.println(c);
		}
	}
}
