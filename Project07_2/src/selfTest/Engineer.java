package selfTest;

public class Engineer extends Employee{
	private String workZone;
	private String project;
	
	public Engineer(String name, int employeeNum, String workZone, String project) {
        super(name, employeeNum);
        this.workZone = workZone;
        this.project = project;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj instanceof Engineer) {
	        Engineer eng = (Engineer) obj;
	        return super.equals(obj) && (this.workZone == null || this.workZone.equals(eng.workZone) || eng.workZone == null)
	                && (this.project == null || this.project.equals(eng.project) || eng.project == null);
	    }
	    return false;
	}

	public String toString() {
		return ("Name : " + getName() + "\nEmp# : " + getEmployeeNum() + "\nLocation : " + getDepartment() + ", " + workZone);
    }
	
}
