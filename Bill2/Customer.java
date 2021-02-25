package Bill2;

public class Customer {
	private String name,pho;
	int ID;
	
	Customer(int ID,String name, String pho)
	{
		this.ID = ID;
		this.name = name;
		this.pho = pho;
	}

	

	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPho() {
		return pho;
	}

	public void setPho(String pho) {
		this.pho = pho;
	}
	

}
