package selfTest;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	public ChocolateBoiler() { /*Change the header*/
		empty = true;
		boiled = false;
	}
	
	private static ChocolateBoiler uniqueInstance;
	public static ChocolateBoiler getInstance() { /*Change the header*/
			if(uniqueInstance == null) {
				synchronized (ChocolateBoiler.class) {
					if(uniqueInstance == null)
						uniqueInstance = new ChocolateBoiler();
				}
			}
		return uniqueInstance;
	}
	
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("Filling with mixture");
		}
		else
			System.out.println("Already filled");
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
			System.out.println("Draining the mixture");
		}
		else
			System.out.println("Already drained");
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
			System.out.println("Boiling the mixture");
		}
		else
			System.out.println("Already boiled");
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
