package JavaD3HW1;

public class PolymorphismDemo {

	public static void main(String[] args) {
//		EmailLogger logger = new EmailLogger();
//		logger.Log("Log mesajý");
		
		// plug and play sistemi. Yeni class geldi ama hýzlýca eklendi. 
		//Polymorphism: Farklýlýk budur. 
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		for (BaseLogger logger : loggers) {
//			logger.Log("Log mesajý");
//		}
		
		CustomerManager3 customerManager = new CustomerManager3(new FileLogger());
		customerManager.add();
		
	}
}