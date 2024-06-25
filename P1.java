package problems;

import java.util.Scanner;

public class P1 {
	//number is positive negative
	public static void  PN(int n) {
		if(n>0) {
			System.out.println(n + "is positive");
		}else {
			System.out.println(n + "is negative");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
	
		int n = sc.nextInt();
		PN(n);
	}
		

}
