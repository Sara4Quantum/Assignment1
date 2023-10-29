package bank.madurai;

import bank.chennai.SBI;

public class Account_Holder_Madurai extends SBI{
public static void main(String[] args) {
	SBI a1c = new SBI();
	a1c.create_account();
	
	 a1c.get_loan(4000);
	System.out.println(a1c.branch_name);
	
}
}
