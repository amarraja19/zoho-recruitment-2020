package Qustioin;

/*
 Write a program to implement Zeckondorf's theorem. 

Definition: Zeckendorf's theorem states that every positive integer can be 
represented uniquely as the sum of one or more distinct Fibonacci numbers 
in such a way that the sum does not include any two consecutive Fibonacci numbers. 

Example:

Input: 64
Output: 55+8+1
Input: 50
Output: 34+13+3
 */

public class Anstwo {
	public static int near(int n)
	{
		if(n==0||n==1)
			return n;
		
		int f1 = 0, f2 =1, f3 = 1;
		while(f3<=n)
		{
			f1 = f2;
			f2=f3;
			f3=f1 + f3;
			
		}
		return f2;
	}
	public static void pri(int n)
	{
		while(n>0)
		{
			int f = near(n);
			System.out.println(f+"");
			n = n-f;
		}
	}
public static void main(String[] args)
{
	int n = 64;
	System.out.println(" non neighbouring Fibonaci'"
			+ " number"+n+"is");
	pri(n);
	
}
}
