package services;

import services.abstracts.BankingAbstractFactory;
import services.interfaces.Banking;

public class MobileBanking extends BankingAbstractFactory{
	@Override
	public Banking getTransactionMode(String mode) {
		if(mode == "fundsTransfer")
		{
			return new FundsTransfer("Mobile Banking ");
		}
		else if(mode == "Bill Payment")
		{
			return new BillPayment("Mobile Banking");
		}
		return null;
	}
}
