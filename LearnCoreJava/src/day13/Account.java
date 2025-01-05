package day13;

public class Account {

	//Encapsulation -> wrapping up of method and variable in single unit 
	//all variable should be private, for every variable two methods should be there (get and set)
	//variable can be accessed only through methods
	
	private int accno;
	private String name;
	private double amount;
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
