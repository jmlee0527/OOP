package selfTest;

public class Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee("John Smith",1234,"door and panels");
		Manager emp2 = new Manager("John Smith",1234,25,"team 7");
	
		System.out.println(emp1);
		System.out.println();
		System.out.println(emp2);
		System.out.println();
		System.out.println("Equality : " + emp1.equals(emp2));
	}
}
