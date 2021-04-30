package JavaD3HW1;

public class inheritanceDemo {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
		// BaseKrediManager hem tarim için hem de ogretmen için annesi olduðu için, anneden sonra çocuk istenebiliyor. 
		// Referans tip in özelliði.
	}

}
