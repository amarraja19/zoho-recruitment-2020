

/*
 1. Write a program to sort an array of "numbers in string representation" in their corresponding numerical order without using atoi or its implementations. 

Example:

Input:
[
	"1",
	"14",
	"100",
	"3",
	"38",
	"425"
	"6",
	"82"
]
 */
public class Anstwo_ii {
	
	public static int[] sortt(int o[])
	{
		int temp;
		for(int i=0; i<o.length;i++)
		{
			for(int j=0; j<o.length;j++)
			{
				if(o[i] < o[j]) {    
	                   temp = o[i];    
	                   o[i] = o[j];    
	                   o[j] = temp;
				}
			}
		}
		
		return o;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"1","14","100","3","38","425","6","82"};
		int [] o = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
			o[i] = Integer.parseInt(a[i]);			
		}
		
		o=sortt(o);	
		System.out.println("\nOutput:");
		for(int i=0;i<o.length;i++)
		{
			System.out.print(" "+o[i]);
			
		}
	}
}
