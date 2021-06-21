package services;

import services.interfaces.Banking;

public class FundsTransfer implements Banking{
	private String mode;
	FundsTransfer  (String bankingMode){
		this.mode = bankingMode;
	}
	
	@Override
	public String transferAmount(int amount) {
		return amount + " rs successfully transfered through "+ this.mode +"banking";
	}
}