package assignment;

import java.util.Calendar;
import java.util.Scanner;

import assignment.Course;


public class TimeTable {
	Course[][] timeTable = new Course[5][10];
	//Course subject = new Course();
	
	public enum DAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
	}

	public TimeTable() {
		timeTable = new Course[DAYS.values().length][10];
		initialize();
		
	}

	private void initialize() {
        for (int i = 0; i < timeTable.length; i++) {
            for (int j = 0; j < timeTable[i].length; j++) {
                if (j == 3) {
                    timeTable[i][j] = new Course(" LUNCH", "-", "-");
                } else if (j == 7) {
                    timeTable[i][j] = new Course(" DINNER", "-", "-");
                } else {
                    timeTable[i][j] = new Course(" ----", "-", "-");
                }
            }
            
        }
        
	}

	public String getSchedule(String day, int period) {

        int dayIndex = DAYS.valueOf(day).ordinal();
        Course course = timeTable[dayIndex][period-1];
        return "At that time you have: " + course.getDetails();
	}

	public boolean setSchedule(String day, int period, String name, String tutor, String room) {
        if (period == 3 || period == 7) {
            return false;
        }
        int dayIndex = DAYS.valueOf(day).ordinal();
        timeTable[dayIndex][period-1].setName(name);
        timeTable[dayIndex][period-1].setProfessor(tutor);
        timeTable[dayIndex][period-1].setRoomNumber(room);
        return true;
	}

	public String toString() {		//timetable 형태를 return
            StringBuilder sb = new StringBuilder();
            sb.append("\tMONDAY TUESDAY WEDNESDAY THURSDAY FRIDAY\n");
            for (int i = 0; i < timeTable[0].length; i++) {
                sb.append((i + 1) + "\t");
                for (int j = 0; j < timeTable.length; j++) {
                    sb.append(timeTable[j][i].getName() + "\t");
                }
                sb.append("\n");
            }
            return sb.toString();
        }

	public String oneDaySchedule(String day) {			//요일을 입력받아 해당 요일 시간표 반환
        int dayIndex = DAYS.valueOf(day).ordinal();
        String result = DAYS.values()[dayIndex] + "\n";
        for (int j = 0; j < timeTable[dayIndex].length; j++) {
            result += timeTable[dayIndex][j].getDetails() + "\t";
        }
        result += "\n";
        return result;
	}
	
	public String subjectSchedule(String sub) {			//강의명을 입력 받아 해당 요일을 반환
        String result = "";
        for (int i = 0; i < timeTable.length; i++) {
            for (int j = 0; j < timeTable[i].length; j++) {
                if (timeTable[i][j].getName().equals(sub)) {
                    result += "Subject: " + timeTable[i][j].getName() + "\n" + "Day: "+ DAYS.values()[i] + "\n" + "Lecture: "+ (j+1) + "\n" + "Professor: " + timeTable[i][j].getProfessor() + "\n" + "Room No: " + timeTable[i][j].getRoomNumber();
                }
            }
        }
        return result;
	}
	
	public Calendar setInputDate(String date) {			//날짜를 입력받아 calendar class 객체에 저장 후 객체를 반환
	
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(4, 6)) - 1;
        int day = Integer.parseInt(date.substring(6));
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return cal;
    
	}
}