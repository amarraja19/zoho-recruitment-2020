package Rest_API;

import java.util.Scanner;

public class Polymomial 
{
	static boolean checkdate(int d, int m, int y)
	{
	  
	    if (m < 1 || m > 12)
	        return false;
	    if (d < 1 || d > 31)
	        return false;
	  

	    if (m == 2) 
	    {
	        if (isLeap(y))
	            return (d <= 29);
	        else
	            return (d <= 28);
	    }
	  
	    if (m == 4 || m == 6 || m == 9 || m == 11)
	        return (d <= 30);
	  
	    return true;
	}
	static String rev(String input) 
	{
	        char[] a = input.toCharArray();
	        int i, j = a.length - 1;
	        for (i = 0; i < j; i++, j--) 
	        {
	            char temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	        }
	        return String.valueOf(a);
	    }
	      
	static boolean isLeap(int year)
	{
	    return (((year % 4 == 0)
	            && (year % 100 != 0))
	            || (year % 400 == 0));
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int D,M,Y,YT = 0,t1=0;
		
		
		System.out.println("Enter Date with DD/MM/YYYY formate");
		System.out.print("Enter Date (DD):");
		D=sc.nextInt();
		
		System.out.print("Enter Month (MM):");
		M=sc.nextInt();
		
		System.out.print("Enter Year (YYYY):");
		Y=sc.nextInt();
		
		YT = Y+5000;
		if(Palindromedate.checkdate(D,M,Y))
		{
			for (int year = Y; year <= YT; year++)
		    {
		  
		        String k = String.valueOf(year);
		        String re = k;
		        re = rev(re);
		        int  day =0, month =0;
		        //System.out.println(t1);
		        if(t1==0)
		        {
		        	day =D;
		        	month = M;
		        	t1++;	
		        	
		        }
		        else 
		        {
		        	day = Integer.parseInt(re.substring(0, 2));
			        month = Integer.parseInt(re.substring(2, 2 + 2));
			       
		        }
		        
		        
		        if (checkdate(day, month, year))
		        {
		            System.out.print(re + k +"\n");
		            YT=0;
		        }
		    }
			
		}
		else
		{
			System.out.print("Invalied");
		}
		
		
	}

}
