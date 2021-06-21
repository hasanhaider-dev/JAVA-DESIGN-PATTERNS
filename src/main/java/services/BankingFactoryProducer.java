package services;

import services.abstracts.BankingAbstractFactory;

public class BankingFactoryProducer {
	 public static BankingAbstractFactory getBankingFactory(boolean onlineBanking){   
	      if(onlineBanking){
	         return new OnlineBanking();         
	      }else{
	         return new MobileBanking();
	      }
	   }
}
