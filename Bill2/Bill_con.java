package Bill2;

public class Bill_con {
	private String model_id;
	private int bill_id, cust_id,count;
	private double price,rate,tax;
	
	Bill_con(String model_id,int cust_id, int bill_id,int count,double rate,double tax,double price)
	{
		this.model_id = model_id;
		this.cust_id = cust_id;
		this.bill_id = bill_id;
		this.count=count;
		this.rate = rate;
		this.tax = tax;
		this.price = price;
	}

	public String getModel_id() {
		return model_id;
	}

	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getBill_id() {
		return bill_id;
	}

	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	

}
