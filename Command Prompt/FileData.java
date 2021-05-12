package string_pro;

public class FileData 
{
	private String path, file_name;
	
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

}
