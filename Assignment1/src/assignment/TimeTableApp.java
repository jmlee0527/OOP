
package assignment;

import java.util.Calendar;
import java.util.Scanner;

public class TimeTableApp {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String[] weeks = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
		Calendar cal = Calendar.getInstance();
		TimeTable timeTable = new TimeTable();
		int enter, period;
		String name, day, tutorName, roomName, sub, str,date;
		boolean check;
		boolean when = true;
		System.out.println("	LEE JUNG MIN  2018008959 Assignment1\n");
		
		do {
			System.out.println(timeTable.toString());
			System.out.println("===============Main Menu================");
			System.out.println("(1) Add a class to my time table");
			System.out.println("(2) View the class at a specific period");
			System.out.println("(3) View schedule of a specific class");
			System.out.println("(4) TimeTable corresponding to input date");
			System.out.println("(5) Exit the program");
			System.out.println("===============Main Menu================");
			enter = keyboard.nextInt();
			switch (enter) {
			case 1: {
				System.out.println("Please enter the day to add the class");
				day = keyboard.next();
				day = day.toUpperCase();
				System.out.println("Please enter the period to add the class");
				period = keyboard.nextInt();
				System.out.println("Please enter the name of the class");
				name = keyboard.next();
				System.out.println("Please enter the name of the tutor");
				tutorName = keyboard.next();
				System.out.println("Please enter the name of the room ");
				roomName = keyboard.next();

				check = timeTable.setSchedule(day, period, name, tutorName, roomName);
				if (check == true)
					System.out.println("Class successfully added");
				else
					System.out.println("Class was NOT successfully added");
				break;

			}
			case 2: {
				System.out.println("Please enter the day of the class");
				day = keyboard.next();
				day = day.toUpperCase();
				System.out.println("Please enter the peroid of the class");
				period = keyboard.nextInt();
				System.out.println(timeTable.getSchedule(day.toString(), period));
				break;

			}
			case 3: {
				System.out.println("Please enter the class name");
				sub = keyboard.next();
				str = timeTable.subjectSchedule(sub);
				
				if (str.isEmpty()) {
					System.out.println("There are no class");
					break;
				} else {
					System.out.println(str);
				}
				break;
			}
			case 4: {
				System.out.println("Enter the date:");
				date = keyboard.next();
				cal = timeTable.setInputDate(date);
				
				if (cal.get(Calendar.DAY_OF_WEEK) - 1 == 0 || cal.get(Calendar.DAY_OF_WEEK) - 1 == 6) {
					System.out.println("There are no schedule");
					break;
				} else {
					System.out.println(timeTable.oneDaySchedule(weeks[cal.get(Calendar.DAY_OF_WEEK) - 1]));
				}

				break;

			}
			case 5: {
				when = false;
				break;
			}
			default:
				System.out.println("Try again");
			}
		} while (when);

	}

}