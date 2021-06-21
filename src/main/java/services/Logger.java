package services;

public class Logger {
	
	private Logger logger = new Logger();

	private Logger(){}

   public Logger getLogger(){
      return logger;
   }

   public void logData(String message){
      System.out.println(message);
   }
}
