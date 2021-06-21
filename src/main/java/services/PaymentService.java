package services;

import services.abstracts.BankingAbstractFactory;
import services.interfaces.Banking;

public class PaymentService {
	public static String payAmount(Boolean onlinePayment, String transactionMode, int amount)
	{
		  BankingAbstractFactory bankingFactory = BankingFactoryProducer.getBankingFactory(onlinePayment);
	      Banking bankingObj = bankingFactory.getTransactionMode(transactionMode);
	      return bankingObj.transferAmount(amount);
	}
}
