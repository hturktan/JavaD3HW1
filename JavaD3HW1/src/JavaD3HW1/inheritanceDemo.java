package JavaD3HW1;

public class inheritanceDemo {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
		// BaseKrediManager hem tarim i�in hem de ogretmen i�in annesi oldu�u i�in, anneden sonra �ocuk istenebiliyor. 
		// Referans tip in �zelli�i.
	}

}
