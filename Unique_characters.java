import java.util.*; 

public class Unique_characters {
	


public static void main(String[] args) 
{ 
    String k = "ZOHOAMAQQ";
    char s[] = k.toCharArray();
    
    k=k.toLowerCase();
    System.out.println(k);
	char str[] = k.toCharArray(); 
    int n = str.length; 
    int index = 0; 


    for (int i = 0; i < n; i++) 
    { 
 
        int j; 
        for (j = 0; j < i; j++)  
        { 
            if (str[i] == str[j]) 
            { 
                break; 
            } 
        } 

        if (j == i)  
        { 
            str[index++] = str[i]; 
            System.out.print(s[i]);
        }
    }
    
    
} 
}
