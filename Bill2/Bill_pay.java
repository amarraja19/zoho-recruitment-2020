package Bill2;

public class Bill_pay {
	private int bill_id,cust_id;
	private double total, blance;
	Bill_pay(int bill_id,int cust_id,double total,double blance)
	{
		this.bill_id=bill_id;
		this.cust_id=cust_id;
		this.total=total;
		this.blance=blance;
		
	}
	public int getBill_id() {
		return bill_id;
	}
	public void setBill_id(int bill_id) {
		this.bill_id = bill_id;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getBlance() {
		return blance;
	}
	public void setBlance(double blance) {
		this.blance = blance;
	}

	

}
