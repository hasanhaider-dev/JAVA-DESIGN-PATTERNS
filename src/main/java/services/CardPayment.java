package services;

import services.interfaces.Banking;

public class CardPayment implements Banking{
	private String mode;
	CardPayment(String bankingMode){
		this.mode = bankingMode;
	}
	@Override
	public String transferAmount(int amount) {
		return amount + " rs epayment made through "+ this.mode +" banking";
	}
}
