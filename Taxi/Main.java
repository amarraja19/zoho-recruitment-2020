package Taxi;

import java.util.ArrayList;
import java.util.*;

import Long_programing.Student;

public class Main {
	static ArrayList<Customer> list= new ArrayList<Customer>();
	static char start,end;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i =0;
		Scanner scanner=new Scanner(System.in);
		boolean k=true;
		 while (k)
         {
			System.out.println("Enter 1- add details 2- display 3-exit");
			int o;
            o=scanner.nextInt();
            switch (o)
            {
            	case 1:
            		System.out.println("Customer Details");
             		/*System.out.println("Pickup Point");
              		start=scanner.next().charAt(0);
             		System.out.println("Drop Point");
					end=scanner.next().charAt(0);*/
					i++;
					System.out.println(i);
					Customer customer = new Customer(1,'a','b');
					list.add(1,customer);
					i++;
					customer = new Customer(2,'c','d');
					list.add(2,customer);
					i++;
					customer = new Customer(3,'a','d');
					list.add(3,customer);
					
				break;
				
             	case 2:
             		System.out.println("/n/n/n");
             		System.out.print("----------------------------");
             		for(int j=1;j<i;j++)
             		{
             			System.out.println("Customes ID: "+list.get(j).getId() +" Starting Piont:  " +list.get(j).getStart()+
             					" Ending Piont: "+list.get(j).getEnd());
             		}
             		System.out.print("----------------------------");
             		System.out.print("/n/n/n");
             	break;
				
             	case 3:
             		k=false;
             	break;
             	
            }					        
        }
	}

}
