package selfTest;

public class Manager extends Employee{

	private int officeNum;
	private String team;
	
	public Manager(String name, int employeeNum, int officeNum, String team) {
        super(name, employeeNum);
        this.officeNum = officeNum;
        this.team = team;
	}
	
	public String toString() {
		return ("Name : " + getName() + "\nLocation : " + getDepartment() + ", " + officeNum);
	}
	
	public boolean equals(Object obj) {
	    if (obj instanceof Manager) {
	        Manager mgr = (Manager) obj;
	        return super.equals(obj) && officeNum == mgr.officeNum && team.equals(mgr.team);
	    }
	    return false;
    }
}	
