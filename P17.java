package problems;

import java.util.Scanner;

public class P17 {
//factorial of a number
		public static int fact(int n) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact *= i;
			}
			return fact;

		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int n = sc.nextInt();
			System.out.println("The factorial of number " + n + " is " + fact(n));
		
		}

	

	}


