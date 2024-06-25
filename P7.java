package problems;

import java.util.Scanner;

public class P7 
{
	//leap year
	public static boolean leapyear(int n) {
		if(n%4==0 && n%100==0 && n%400==0) {
			return true;
			
		}else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the year:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean res=leapyear(n);
		if(res == true) 
			System.out.println(n +"is a leap year");
		
		else 
			System.out.println(n +"is not a leap year");
		
	
		

	}

}
