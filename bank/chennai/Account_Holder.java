package bank.chennai;

public class Account_Holder {

	public static void main(String[] args) {
		SBI acc = new SBI();
		acc.create_account();
		acc.get_loan(100);
		acc.empId = "15";
		acc.empName ="join";
		
	System.out.println(acc.empName);
	System.out.println(acc.empId);
	System.out.println(acc.branch_name);
	}

}
