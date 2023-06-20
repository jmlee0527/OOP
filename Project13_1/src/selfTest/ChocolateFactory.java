package selfTest;

public class ChocolateFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ChocolateBoiler a = new ChocolateBoiler(); //Comment the statements to test singleton
//		ChocolateBoiler b = new ChocolateBoiler(); //Comment the statements to test singleton
		ChocolateBoiler a = ChocolateBoiler.getInstance(); //Uncomment the statements to test singleton
		ChocolateBoiler b = ChocolateBoiler.getInstance(); //Uncomment the statements to test singleton
		
		a.fill();
		b.fill();
		a.boil();
		b.boil();
		a.drain();
		b.drain();
		
	}
}
