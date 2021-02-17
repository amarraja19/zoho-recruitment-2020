package Taxi;

public class Customer {
	private int Id;
	private char start,End;
	Customer(int Id, char start, char end)
	{
		this.Id = Id;
		this.start = start;
		this.End = end;
		
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public char getStart() {
		return start;
	}
	public void setStart(char start) {
		this.start = start;
	}
	public char getEnd() {
		return End;
	}
	public void setEnd(char end) {
		End = end;
	}
	
	

}
