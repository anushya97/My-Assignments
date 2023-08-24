package Assignments.week1;

public class IsPrime  {

	public static int Primenumber(int num)  {
		// TODO Auto-generated method stub

		   int count  = 0;
		  
		   
		      if(num == 0||num == 1) 
		      {
		    	  count = 1;
		    	  
		      } 
		      else {
		         for(int i = 2; i <= num/2; i++) {
		            if(num % i == 0) {
		            	count = 1;
		               break;
		            }
		         }
		      }
		      return count;
		   }
		   
	
	
	public static void main(String args[]) {
		      int count, num = 12;
		      count = Primenumber(num);
		      
		      if(count == 0) 
		      {
		         System.out.println( num + " is a prime number");
		      } else 
		      {
		         System.out.println( num + " is not a prime number");
		      }
	}
}