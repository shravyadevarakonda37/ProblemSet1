package problems;

public class P12 {
//palindrome

		public static void main(String[] args) {
			
			 int r,sum=0,temp;    
			  int n=1234; 
			  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			

		}

