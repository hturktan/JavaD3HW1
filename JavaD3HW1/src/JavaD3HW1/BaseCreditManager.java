package JavaD3HW1;

public class BaseCreditManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	} 
}

// override olmas�n� engellemek i�in "final" kelimesi public den sonra gelir. 
// Final yaz�l�rsa, di�er k�s�mlarda override yap�lamaz. 