package problems;

import java.util.Scanner;

public class P23 {
//Harshad Number
	public static int harshad(int n) {
		int sum = 0, a = 0;
		while (n > 0) {
			a = n % 10;
			sum += a;
			n = n / 10;

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int sum = harshad(n);
		if (n % sum == 0)
			System.out.println(n + " is a Harshad number");
		else
			System.out.println(n + " is not a Harshad number");
		

	}

}
	

