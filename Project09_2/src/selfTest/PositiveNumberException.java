package selfTest;

public class PositiveNumberException extends Exception {
	public PositiveNumberException() {
		super("Positive Number");
	}
	
	public PositiveNumberException(String message) {
		super(message);
	}
}
