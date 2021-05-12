package string_pro;

import java.util.*;

public class Comandpro2 {
	public static Stack<String> com = new Stack<String>();
	static ArrayList<FileData> File = new ArrayList<FileData>();
	static int File_num = 0;
	
	private static void addcom(Stack com, String k1)
	{
		com.push(new String(k1));
		System.out.println("stack: " + com);  
	}	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FileData filedata = new FileData("null","null","null");
		File.add(File_num,filedata);
		Scanner sc = new Scanner(System.in);
		String k;
		String[] temp;
		int i=0;
		
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
				System.out.println("DO you need to add file\nThen Enter '1' or Enter '0' to End ");
				i = sc.nextInt();
				
				
				if(i==1)
				{
					//do
					//{
						String file_name, file_data =" Java is a High Level, class-based, "
								+ "object-oriented programming language that is designed to have "
								+ "as few implementation dependencies as possible.";
						System.out.println("Enter file name");
						file_name = sc.next();
						
						System.out.print(" ");
						System.out.println("Enter file Data");
						file_data = sc.nextLine();
						
						File_num++;
						filedata = new FileData(temp[1],file_name,file_data);
						System.out.println("Enter file Data"+file_data);
						File.add(File_num,filedata);
						
						
						/*System.out.println("DO you need to add more file \n Then Enter '2' or Enter '0' to End");
						i = sc.nextInt();
						
					}while(i==2);
					i=0;*/
					
				}				
				
			}
			else if(temp[0].equals("cd.."))
			{
				com.pop();
				System.out.println(" Directly" + com);
			}
		}while(!temp[0].equals("end"));
		
		
		if(File_num>0)
		{
			System.out.println();
		     System.out.println("-----------------------------------------");
		     for(int j=1;j<=File_num;j++)
		     {
		    	 System.out.println("-----------------------------------------");
		    	 System.out.println("Path:"+File.get(j).getPath()+"\nFile Name:"+File.get(j).getFile_name()+"\n"
		    	 		+ "File Data:\n"+File.get(j).getFile_data());
		    	 System.out.println("-----------------------------------------");
		     }
		     System.out.println("-----------------------------------------");
		     System.out.println("-----------------------------------------");
		     System.out.println("                    END                  ");
			
		}
		 
		
		

	}

}
