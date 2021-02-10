public class sort_ascending_order{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7};     
		int temp = 0,k;    
		System.out.println("Given array: ");    
		for (int i = 0; i < arr.length; i++) 
		{     
			System.out.print(arr[i] + " ");    
		}    
		System.out.println(); 
		
		
		if(arr.length%2==0)
		{
			k=arr.length/2;	
		}
		else
		{
			k=(arr.length/2)+1;
		}
		
		
		int [] aodd = new int [k];
		//System.out.println(+k);
		int j = 0;
		for(int i=0;i<arr.length;i=i+2 )
		{ 
		  	aodd[j]=arr[i];
		   	j++;
		}
		j--;
		
		
		for(int i=0;i<arr.length;i++ )
		{ 
			if(i%2==0)
		   	{
				System.out.print( aodd[j]+" ");
			  	j--;
		    }
		    else
		    {
		    	System.out.print( arr[i]+" ");
		    }
		}
		       
	}

}
