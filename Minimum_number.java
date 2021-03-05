public class Minimum_number {public static void main(String[] args) 
{
	// TODO Auto-generated method stub
	int [] arr = new int [] {2, 5, 9, 1, 21};     
    int f=arr[0];
        
  
    System.out.println("Given array: ");    
    for (int i = 0; i < arr.length; i++) 
    {     
        System.out.print(arr[i] + " ");    
    }    
    System.out.println(); 
     
    for (int i = 0; i < arr.length; i++) 
    {        
        if (arr[i] < f) 
        { 
            f = arr[i]; 
        } 
    }
    System.out.println("Minimum number is the geven array "+f);    
    
    
}

}
