package tryCatch;

import java.util.Scanner;

public class UncheckExcpetions {
static 	int a;
static 	int b;
static	int c;
	public static void main(String[] args) {
   
		//10/0 ---> erro 
		
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		   //valueable
		
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("we cant divide with zero 0");
		}
		
		System.out.println(c);
		
	}

}
