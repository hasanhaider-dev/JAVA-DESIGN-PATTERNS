package services;

import services.abstracts.BankingAbstractFactory;
import services.interfaces.Banking;

public class OnlineBanking extends BankingAbstractFactory{
	@Override
	public Banking getTransactionMode(String mode) {
		if(mode == "fundsTransfer")
		{
			return new FundsTransfer("Online Banking");
		}
		else if(mode == "cardPayment")
		{
			return new CardPayment("Online Banking");
		}
		return null;
	}
}
