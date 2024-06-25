package problems;

import java.util.Scanner;

public class P22 {
//perfect square
	public static boolean perfect(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (i * i == num)
				return true;
			else
				continue;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		boolean res = perfect(n);
		if (res == true)
			System.out.println(n + " is a perfect Square number.");
		else
			System.out.println(n + " is not a perfect square number");
	}

}
	
