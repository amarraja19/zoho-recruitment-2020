
import java.util.*;
public class zoho-recruitment-2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int value = 5;
		System.out.print("Enter a value");
		 value = sc.nextInt();
		for(int i = 0; i < value; i++)
		{
			int temp = value;
			System.out.print(temp);
			for(int j = 0; j < i; j++)
			{
				temp--;
				System.out.print(temp);
		    }
			for(int k = 0; k < (value-1) - i; k++)
			
				System.out.print(temp);
				System.out.println();
			

		}

	}

}
