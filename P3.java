package problems;

import java.util.Scanner;

public class P3 {
	//sum of natural number
	public static void SumNaturalNum(int n) {
		System.out.println(n*(n+1)/2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n value:");
		int n = sc.nextInt();
		SumNaturalNum(n);
		

	}

}
