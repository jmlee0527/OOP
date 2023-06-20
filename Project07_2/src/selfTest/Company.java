package selfTest;

public class Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee("John Smith",1234,"door and panels");
		Engineer emp2 = new Engineer("Peter Anderson",1432,"fabrication #7","door and panels");
		Employee emp3 = new Employee("Jane Roberts",2345);
		Employee emp4 = new Employee("John Smith",1234);
		Manager emp5 = new Manager("John Smith",1234,25,"team 7");
		
		System.out.println(emp1);
		System.out.println();
		System.out.println(emp2);
		System.out.println();
		System.out.println(emp3);
		System.out.println();
		System.out.println(emp4);
		System.out.println();
		System.out.println("Equality : " + emp1.equals(emp2));
		System.out.println("Equality : " + emp1.equals(emp4));
		System.out.println("Equality : " + emp1.equals(emp5));
		System.out.println("Equality : " + emp5.equals(emp1));
	}
}
