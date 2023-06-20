package selfTest;

public class Manager extends Employee {

	private int officeNum;
	private String team;
	
	public Manager(String name, int employeeNum, int officeNum, String team) {
		super(name, employeeNum);
		this.officeNum = officeNum;
		this.team = team;
	}
	
    public String toString() {
        return "Name : "+ getName() + "\nLocation: " + getDepartment() + ", " +  officeNum;
    }
    
}
