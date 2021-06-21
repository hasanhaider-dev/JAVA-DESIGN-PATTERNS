package services;

import services.interfaces.Banking;

public class BillPayment implements Banking{
	
	private String mode;
	BillPayment (String bankingMode){
		this.mode = bankingMode;
	}
	
	@Override
	public String transferAmount(int amount) {
		return amount + " rs bill successfully paid through "+ this.mode +"banking";
	}
}