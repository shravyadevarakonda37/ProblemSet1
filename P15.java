package problems;

import java.util.Scanner;

public class P15 {
//fibonacci
	public static void fibonacci(int n) {
		int sum=0;
		int f1=0;
		int f2=1;
		for(int i=0;i<n;i++) {
			System.out.println(f1);
			sum=f1+f2;
			f1=f2;
			f2=sum;	
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int n=sc.nextInt();
		fibonacci(n);
	

	}

}
