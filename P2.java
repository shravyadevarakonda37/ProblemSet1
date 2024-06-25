package problems;
import java.util.Scanner;

public class P2 {
	//even odd
	
		public static void eveOrodd(int a) {
			if(a%2==0) {
				System.out.println(a+" is a even number.");
			}
			else {
				System.out.println(a+" is a odd number.");
			}
		}

		public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number : ");
			int a=sc.nextInt();
			eveOrodd(a);


		}

	}