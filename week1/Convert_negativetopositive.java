package Assignments.week1;

public class Convert_negativetopositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = -56;
		int g;
		
          if (num>0)
          {
        	  System.out.println("Number is Positive: "+num);
          }
          else if (num==0)
          {
        	  System.out.println("Number is zero: "+num);
          }
          else
          {
        	  System.out.println("Number is Negative: "+num);
        	  
        	  g=num*(-1);
        	  
        	  System.out.println("Number coverted to positive: "+g);
        	  
          }
	}	
	}
