package JavaD3HW1;

public class PolymorphismDemo {

	public static void main(String[] args) {
//		EmailLogger logger = new EmailLogger();
//		logger.Log("Log mesaj�");
		
		// plug and play sistemi. Yeni class geldi ama h�zl�ca eklendi. 
		//Polymorphism: Farkl�l�k budur. 
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		for (BaseLogger logger : loggers) {
//			logger.Log("Log mesaj�");
//		}
		
		CustomerManager3 customerManager = new CustomerManager3(new FileLogger());
		customerManager.add();
		
	}
}