package problems;

public class P11 {
//reverse 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345,rev=0;
		while(n!=0) {
			int remainder=n%10;
			rev= rev*10+remainder;
			n=n/10;
		}
		System.out.println("reverdse of a given number :"+rev);

	}

}
