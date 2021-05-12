package string_pro;

public class FileData 
{
	private String path, file_name, file_data;
	
	

	FileData(String path, String file_name, String file_data)
	{	
		this.path = path;
		this.file_name = file_name;
		this.file_data = file_data;
	}
	
	FileData(String path, String file_name)
	{	
		this.path = path;
		this.file_name = file_name;
		
	}
	
	public String getPath() 
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public String getFile_name()
	{
		return file_name;
	}

	public void setFile_name(String file_name) 
	{
		this.file_name = file_name;
	}

	public String getFile_data()
	{
		return file_data;
	}

	public void setFile_data(String file_data) 
	{
		this.file_data = file_data;
	} 
}
