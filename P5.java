package problems;

import java.util.Scanner;

public class P5 {
	//sum of numbers in a given interval
	public static void sum(int min,int max) {
		int sum=0;
	for(int i=min;i<=max;i++) {
		
		sum=sum+i;
	}
	System.out.println("The sum of the numbers in interval is"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the interval:");
		int min=sc.nextInt();
		int max = sc.nextInt();
	}

}
