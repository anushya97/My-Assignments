package Assignments.week3.day2;

public class AxisBank extends BankInfo {
	public void saving() {

		System.out.println("open savings account in Axis bank");
	}
	
	public void fixed() {

		System.out.println("open fixed deposit  in Axis bank");
	}
	



public static void main(String[] args) {
	AxisBank ab = new AxisBank();
			ab.fixed();
			ab.saving();
			ab.deposit();
}
}