package problems;

import java.util.Scanner;

//greatest of 3 numbers
public class P6 {
	public static void greater(int a,int b,int c) {
		
		if(a>b && a>c ) {
			System.out.println("a is greater than b and c");
			
		}else if(c>b){
			System.out.println("c is greater than b and a");
			
		}else {
			System.out.println("b is greater than a and c");
		}

	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values a:");
		int a = sc.nextInt();
		System.out.println("Enter values b:");
		int b = sc.nextInt();
		System.out.println("Enter values c:");
		int c = sc.nextInt();
		greater(a,b,c);

		

}
}