package JavaD3HW1;

public class CustomerManager3 {
	private BaseLogger logger;
	
	public CustomerManager3(BaseLogger logger) {
		this.logger = logger;
	}
	public void add() {
		System.out.println("Müþteri eklendi");
		this.logger.log("Log mesajý");
	}
}
