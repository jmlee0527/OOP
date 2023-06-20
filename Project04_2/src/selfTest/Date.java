package selfTest;

public class Date {

	private String month;
	private int day;
	private int year;
	
	public Date() {
		month = "January";
		day = 1;
		year = 1000;
	}
	
	public Date(String monthString, int day, int year) {
		setDate(monthString, day, year);
	}
	
	public Date(Date aDate) {
		if(aDate == null) {
			System.out.println("Fatal Error");
			System.exit(0);
		}
		month = aDate.month;
		day = aDate.day;
		year = aDate.year;
	}
	
	public void setDate(int monthInt, int day, int year) {
		if(dateOK(monthInt, day, year)) {
			this.month = monthString(monthInt);
			this.day = day;
			this.year = year;
		}
		else {
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	
	public void setDate (String monthString, int day, int year) {
		if(dateOK(monthString, day, year)) {
			this.month = monthString;
			this.day = day;
			this.year = year;
		}
		else {
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	
	public void setDate(int year) {
		setDate(1, 1, year);
	}
	
	private boolean dateOK(int monthInt, int dayInt, int yearInt) {
		return ( (monthInt >= 1) && (monthInt <= 12) &&
				(dayInt >= 1) && (dayInt <= 31) &&
				(yearInt >= 1000) && (yearInt <= 9999) );
	}
	
	private boolean dateOK(String monthString, int dayInt, int yearInt) {
		return ( (monthOK(monthString)) &&
				(dayInt >= 1) && (dayInt <= 31) &&
				(yearInt >= 1000) && (yearInt <= 9999) );
	}
	
	private boolean monthOK(String month) {
		return (month.equals("January") || month.equals("February") ||
				month.equals("March") || month.equals("April") ||
				month.equals("May") || month.equals("June") ||
				month.equals("July") || month.equals("August") ||
				month.equals("September") || month.equals("October") ||
				month.equals("November") || month.equals("December"));
	}
	
	public void writeOutput() {
		System.out.println(month + " " + day + ", " + year);
	}
	
	public boolean equals(Date otherDate) {
		return ( (month.equalsIgnoreCase(otherDate.month))
				&& (day == otherDate.day)
				&& (year == otherDate.year) );
	}
	
	public boolean precedes (Date otherDate) {
		return ( (year < otherDate.year)|| 
				(year == otherDate.year && monthInt(month) < otherDate.monthInt(month)) ||
				(year == otherDate.year && month == otherDate.month &&
				day < otherDate.day) );
	}
	
	public String toString() {
		
		if(year == 0 && month == null && day == 0)
			return "alive";
		else
			return (month + " " + day + " " + year);
	}
	
	private String monthString(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			System.out.println("Fatal Error");
			System.exit(0);
			return "Error";
		}
	}
	
	private int monthInt(String monthStr) {
		switch (monthStr) {
		case "January":
			return 1;
		case "February":
			return 2;
		case "March":
			return 3;
		case "April":
			return 4;
		case "May":
			return 5;
		case "June":
			return 6;
		case "July":
			return 7;
		case "August":
			return 8;
		case "September":
			return 9;
		case "October":
			return 10;
		case "November":
			return 11;
		case "December":
			return 12;
		default:
			System.out.println("Fatal Error");
			System.exit(0);
			return -1;
		}
	}
}
