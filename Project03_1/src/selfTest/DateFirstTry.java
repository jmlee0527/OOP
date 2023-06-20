package selfTest;

public class DateFirstTry {

	/*Write the Code*/
	private String month;
	private int day;
	
	public void makeItNewYears() {
		/*Write the Code*/
		this.setMonth("January");
		this.setDay(1);
		
	}
	
	public String yellIfNewYear() {
		/*Write the Code*/
		String result;
		
		if(this.getMonth() == "January" && this.getDay()== 1)
			result = "Happy new year!";
			//System.out.println("Happy new year");
		else
			//System.out.println("Not New Year's Day");
			result = "Not New Year's Day.";
		return result;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
}
