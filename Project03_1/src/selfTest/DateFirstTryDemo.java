package selfTest;

public class DateFirstTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write the Code*/
		DateFirstTry date1 = new DateFirstTry();
		date1.setMonth("March");
		date1.setDay(30);
		DateFirstTry date2 = new DateFirstTry();
		date2.setMonth("May");
		date2.setDay(27);
	
		date2.makeItNewYears();
		System.out.println("date1: " + date1.yellIfNewYear());
		System.out.println("date2: " + date2.yellIfNewYear());
		
	}

}
