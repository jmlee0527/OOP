package selfTest;

public class TooMuchStuffException extends Exception {

	private int inputNumber;
	
	public TooMuchStuffException(String message) {
		super(message);
	}
	
	public TooMuchStuffException() {
		super("Too much stuff!");
	}
	
	public TooMuchStuffException(int inputNumber){
		super();
		this.inputNumber = inputNumber;
	}
	
	public int getNumber() {
		return inputNumber;
	}
	
}
