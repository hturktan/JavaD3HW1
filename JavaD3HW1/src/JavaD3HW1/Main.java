package JavaD3HW1;

public class Main {
	// class lar reference type. 
	public static void main(String[] args) {
		//class �n, ilk temel �zelli�i gruplama yapmakt�r. 
		
		CustomerManager customerManager = new CustomerManager(); // class �ap�rma i�lemi
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		// value type. De�er tip. 
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		// diziler reference type. 
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 22;
		System.out.println(sayilar2[0]);
	}
}

