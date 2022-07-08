package JavaBasic;
import java.util.Scanner;
public class DivisibleOrNot {

	  public static void main(String[] args)
	 
	{

	    int num;
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter The Number");
	    num =in.nextInt();
	    if((num % 5 == 0) && (num % 11 == 0))

	 {

	    System.out.println("This is Divisible by 5 and 11");
	 
	}

	    else
				
	 {

	    System.out.println("This is Not Divisible by 5 and 11");
	   
	}
	  }

	 }

