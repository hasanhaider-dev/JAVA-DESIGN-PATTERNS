package services.abstracts;

import services.interfaces.Banking;

public abstract class BankingAbstractFactory {
	public abstract Banking getTransactionMode(String mode);
}
