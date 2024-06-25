package problems;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0) {
        	int digit=n%10;
        	sum+=digit;
        	n/=10;
        }
        System.out.println("Sum of digits of a number is " +sum);
	}

}