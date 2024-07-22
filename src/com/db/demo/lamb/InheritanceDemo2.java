package com.db.demo.lamb;

// DRY - Don't Repeat Yourself.

public class InheritanceDemo2 {

	public static void main(String[] args) {
		
		HdfcBank bank1 = new HdfcBank();
		bank1.payInterest();
		bank1.payTax();
		bank1.payGst();

	}
}

class Rbi {
	
	void payInterest() {
		System.out.println("pay interest on deposits");
	}
}

interface FinanceMinistry {
	
}

interface CommerceMinistry {
	
	public abstract void payTax();
	public abstract void payGst();
	
}

class HdfcBank extends Rbi implements FinanceMinistry, CommerceMinistry {

	@Override
	public void payTax() {
		System.out.println("pay tax in time...");
	}

	@Override
	public void payGst() {
		System.out.println("pay GST @18%...");
	}

}

class IciciBank extends Rbi implements FinanceMinistry, CommerceMinistry {

	@Override
	public void payTax() {
		System.out.println("pay tax NOT in time...");
	}

	@Override
	public void payGst() {
		// TODO Auto-generated method stub
		
	}

}




