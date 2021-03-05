import java.util.*;
public class Comandpro 
{
	private static void addcom(Stack com, String k1)
	{
		com.push(new String(k1));
		System.out.println("stack: " + com);  
	}	
	public static Stack<String> com = new Stack<>();	
	public static void main(String[] args) 
  	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String k;
		String[] temp;
		do
		{
			System.out.print("~");
			k = sc.nextLine();
			temp = k.split(" ");
			//System.out.println(k);
			
			if(temp[0].equals("cd"))
			{
				addcom(com,temp[1]);
				System.out.println(temp[1]+" Directly changed");
			}
			else if(temp[0].equals("cd.."))
			{
				com.pop();
				System.out.println(" Directly" + com);
			}
		}
		while(!temp[0].equals("end"));	
	}
}
