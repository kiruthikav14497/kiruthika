package prp;
import java.util.Scanner;
public class Recursion {
	public static void main(String[] args)
}
	System.out.println("Enter N");
	 
	try
	{
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	int number= Integer.parseInt(br.readLine()); 
	Scanner sc = new Scanner(System.in); 
	int number = sc.nextInt(); 
	 
	int sum = sumR(number); // calling sumR function
	 
	System.out.println("Sum of " + number + " Numbers using Recursion is : " + sum);
	 
	}
	 
	catch (Exception e)
	{
	System.out.println ("Give Proper Input i.e. Enter Numeric value only and with in range");
	}
	}
	public static int sumR(int num)
	{
	int sum;
	if(num==1) return(1) ;
	 
	else sum=num + sumR(num-1);
	return sum;
	 
}
}
