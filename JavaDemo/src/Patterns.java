import java.util.Scanner;

public class Patterns {

	public static void main(String a[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		
		System.out.println("The pattern is : ");
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=rows-1; i>=1; i--){
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
