package selfTest;

public class Employee {

	/* Write the code */
	
	private String name;
	private int age;
	private String position;
	private int salary;
	private int vacationDays;
	
	public Employee(/* Write the code */) {
		/* Write the code */
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		this.position = "Engineer";
		this.salary = 15000;
		this.vacationDays = 20;
	}
	
	public Employee(String name, int age, String position, int salary) {
		/* Write the code */
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
		this.vacationDays = 20;
	}
	
	public Employee(String name, int age, String position, int salary, int vacationDays ) {
		/* Write the code */
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
		this.vacationDays = vacationDays;
		
	}
	
	
	public void setSalary(int salary) {
		/* Write the code */
		this.salary = salary;
		
	}
	
	public void outInfo() {
		/* Write the code */
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Position: " + position);
		System.out.println("Salary: " + salary);
		System.out.println("Vocation Days: " + vacationDays);
		
	}
	
	public String vacation(int days) {
		/* Write the code */
		if(vacationDays >= days) {
			vacationDays -= days;
			return "Possible";
		}else {
			return "Impossible";
		}
	}
	
	public boolean equals(Employee employee) {
		/* Write the code */
		return this.name.equals(employee.name)&& this.age == employee.age;
	}
	
}
