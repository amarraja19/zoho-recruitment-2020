package Bill2;

import java.util.ArrayList;
import java.util.Scanner;

import Bill.Drug_SP;

public class Mainclass {
	static ArrayList<Inhouse> list= new ArrayList<Inhouse>();
	static ArrayList<Customer> customerlist= new ArrayList<Customer>();
	static ArrayList<Bill_con> billlist= new ArrayList<Bill_con>();
	static int i=0,j=0,ci=0,ID = 1001,bill_id = 100,bi=0;
	static int op;
	static boolean k=true;
	private static void iniz()
	{
		System.out.println("initializing Billing model");
		System.out.println("***********************************");
		Inhouse inhouse = new Inhouse("tumbersilver2",15,85);
		list.add(i,inhouse); 
		i++;
		
		inhouse = new Inhouse("tumbersilver1",15,70);
		list.add(i,inhouse); 
		i++;
		
		inhouse = new Inhouse("tumbersilver3",15,100);
		list.add(i,inhouse); 
		i++;
		
		inhouse = new Inhouse("tumberbronze1",30,75);
		list.add(i,inhouse); 
		i++;
		
		inhouse = new Inhouse("tumberbronze2",20,105);
		list.add(i,inhouse); 
		i++;
		
		inhouse = new Inhouse("tumberbronze3",15,125);
		list.add(i,inhouse); 
		i++;
		
		inhouse = new Inhouse("spoonsilver1",30,25);
		list.add(i,inhouse); 
		i++;
		
		inhouse = new Inhouse("spoonsilver2",25,45);
		list.add(i,inhouse); 
		i++;
		
		inhouse = new Inhouse("spoonsilver3",25,60);
		list.add(i,inhouse); 
		i++;
		
		inhouse = new Inhouse("cupsilver1",12,150);
		list.add(i,inhouse); 
		i++;
		
		inhouse = new Inhouse("cupbronze1",10,175);
		list.add(i,inhouse); 
		i++;
		
		Customer customer = new Customer(ID,"kumar","9876543210");
		customerlist.add(ci,customer);
		ci++;
		ID++;
		
		customer = new Customer(ID,"kamal","9876458910");
		customerlist.add(ci,customer);
		ci++;
		ID++;
		
		customer = new Customer(ID,"vimal","9986243210");
		customerlist.add(ci,customer);
		ci++;
		ID++;
		
		customer = new Customer(ID,"santhos","9876547413");
		customerlist.add(ci,customer);
		ci++;
		ID++;
		
		customer = new Customer(ID,"mani","9895541259");
		customerlist.add(ci,customer);
		ci++;
		ID++;
	}
	private static void status()
	{
		System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("   Model_id  |count|rate|" );
		for(j=0;j<i;j++)
		{
			System.out.println(list.get(j).getModel_id()+" | "+list.get(j).getCount()+" | "+list.get(j).getRate());
		}
	}
	private static void newcust(String name, String pho)
	{
		Customer customer = new Customer(ID,name,pho);
		customerlist.add(ci,customer);
		ci++;
		ID++;
		
	}
	private static void newbill()
	{
		bill_id++;
		Scanner sc = new Scanner(System.in);
		String name,pho,mid;
		int c_id = 0,t=0,pc,t2,count = 0;
		double p,rate = 0;
		System.out.println("Enter Coustmer Name");
		name = sc.next();
		System.out.println("Enter Coustmer phone number");
		pho = sc.next();
		
		for(j=0;j<ci;j++)
		{
			if( (name ==customerlist.get(j).getName()) && (pho==customerlist.get(j).getPho()) )
			{
				c_id=customerlist.get(j).getID();
				break;
			}
			{
				t=1;
			}			
		}
		if(t==1)
		{
			newcust(name,pho);
		}
		k=true;
		
		
		while(k)
		{
			System.out.println("Enter Coustmer Model ID");
			mid = sc.next();
			for(j=0;j<i;j++)
			{
				
				String midt =list.get(j).getModel_id();
				if(mid.equals(midt))
				{
					
					rate = list.get(j).getRate();
					count= list.get(j).getCount();
					
				}
				/*else
				{
					System.out.println("model value is invalid, Please tryagin Thank you ");
					iniz();
				}*/
			}
			System.out.println("Enter Number of product ");
			pc=sc.nextInt();
			/*if(pc >count)
			{
				System.out.println("not available, Please tryagin Thank you ");
				iniz();
			}*/
			double tax = pc*rate*0.05;
			p = pc*(rate + tax);
			System.out.print(mid+" "+c_id+ " "+bill_id+" "+pc+ " "+rate+" "+tax+" "+p);
			Bill_con bill = new Bill_con(mid,c_id,bill_id,pc, rate, tax, p);
			billlist.add(bi,bill);
			bi++;
			
			System.out.println("1 -add more Product|\n2 - Print Bill ");
			t2=sc.nextInt();
			if(t2==1)
			{
				k=true;
			}
			else if(t2==2)
			{
				billprint(c_id,bill_id,name,pho); 
				k=false;
			}
			else
			{
				k=false;
			}
			
			
		}
		
		
		
	}
	public static void billprint(int C_id,int bid, String name, String pho)
	{
		double total;
		System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Customer ID"+C_id+"\nCustomer Name"+name+"   Phone Number"+pho+"\nbill Id"+bid );
        System.out.println("   Model_id  |count|Rate|tax| price" );
		for(j=0;j<bi;j++)
		{
			if(bid==billlist.get(j).getBill_id())
			{
				System.out.println(billlist.get(j).getModel_id()+"|"+billlist.get(j).getCount()+"|"+billlist.get(j).getRate()+"|"+billlist.get(j).getTax()+"|"+billlist.get(j).getPrice());
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iniz();
	
		Scanner sc = new Scanner(System.in);
		
		while(k)
		{
			System.out.println("1 - New Bill|\n2 - Stock Status|\n3 - Exit");
			op = sc.nextInt();
			switch(op)
			{
			case 1:
				newbill();
				break;
			case 2:
				status();
				break;
			case 3:
				k = false;
				break;
			
			}
		}

	}

}
