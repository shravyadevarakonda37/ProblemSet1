package problems;

import java.util.Scanner;

public class P19 {
	//factorial
	public static void factor(int num) {
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)System.out.println(i);
			else
				continue;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		factor(num);

	}

}

