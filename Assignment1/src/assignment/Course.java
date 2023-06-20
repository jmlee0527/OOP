package assignment;

import assignment.Course;

public class Course {
	public String name;
	public String professor;
	public String roomNumber;
	public boolean isValid;

	public Course(String name, String tutor, String room) {
		this.name = name;
		this.professor = tutor;
		this.roomNumber = room;
	}

	public Course(String name) {
		this.name = name;
	}

	public Course(Course copy) {
		this.name = copy.name;
		this.professor = copy.professor;
		this.roomNumber = copy.roomNumber;
		this.isValid = copy.isValid;
	}

	public String getName() {
		return name;
	}
	
	public String getProfessor() {
		return professor;
	}
	public String getRoomNumber() {
		return roomNumber;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public boolean equals(Course s) {
        if (this.name.equals(s.name) && this.professor.equals(s.professor) && this.roomNumber.equals(s.roomNumber)) {
            return true;
        }
        return false;
    }	

	public String toString() {
		return name;	
	}

	public String getDetails() {
		return "\nName : " + name + "\n" + "Tutor : " + professor +  "\n" + "Room : " + roomNumber + "\n";
		
	}
}