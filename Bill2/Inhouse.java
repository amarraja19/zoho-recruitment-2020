package Bill2;

public class Inhouse {

	private int count;
	private String model_id;
	private double rate;
	Inhouse(String model_id, int count,double rate)
	{
		this.model_id = model_id;
		this.count=count;
		this.rate = rate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getModel_id() {
		return model_id;
	}
	public void setModel_id(String model_id) {
		this.model_id = model_id;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
