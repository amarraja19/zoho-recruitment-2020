import java.util.Scanner;

public class Palindromedatev2 {
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
		for(int ii = 0; ii<20; ii++)
		{
		Scanner sc = new Scanner(System.in);
		int D,M,Y,YT = 0;
		
		
		System.out.println("Enter Date with DD/MM/YYYY formate");
		System.out.println("Enter Date (DD):");
		D=sc.nextInt();
		
		System.out.println("Enter Month (MM):");
		M=sc.nextInt();
		
		System.out.println("Enter Year (YYYY):");
		Y=sc.nextInt();
		int t1 = Y/1000;
		Y = Y-(t1*1000);
		//System.out.print("Year:" +Y);
		
		int T_DM = (D*10) + M;
		
		YT = Y+5000;
		if(Palindromedate.checkdate(D,M,Y))
		{
			String cm = String.valueOf(T_DM);
			cm =rev(cm);
			int te = Integer.parseInt(cm);
			//System.out.print("Year:" +Y+"TE:"+te);

			if(Y<te||M>8)
			{
				Y = Y+1;
			}

			for (int year = Y; year <= YT; year++)
		    {
		  
		        String k = String.valueOf(year);
		        String re = k;
		        re = rev(re);
		   		     
		       try {
		        int day = Integer.parseInt(re.substring(0, 2));
			    int month = Integer.parseInt(re.substring(2, 3));
			    if (checkdate(day, month, year))
		        {
		        	//System.out.print(checkdate(day, month, year));
		        	System.out.println("\n Date:"+day+"\n month:"+month+"\n year:"+(year+(t1*1000)));
		            YT=0;
		        }
		       } 
		       catch (Exception e) 
		       {
				// year++;
		       }
			       

		       
		    }
			
		}
		else
		{
			System.out.print("Invalied");
		}
		}
		
		
	}
}
