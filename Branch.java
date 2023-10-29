package assignment;

public class Branch extends Branch_Plan {
	public  void receive_Customers() {
		System.out.println("payment");
	}
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.do_interview();
		branch.check_accounts(1000);
		branch.pay_tax(2000);
		
		}
}


	 
	 

	