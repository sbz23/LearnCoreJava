package day13;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		
		ac.setAccno(0123);
		ac.setName("Shubham");
		ac.setAmount(1000.23);
		
		System.out.println(ac.getAccno());
		System.out.println(ac.getName());
		System.out.println(ac.getAmount());

	}

}
