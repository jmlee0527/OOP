
package selfTest;

public class EmployeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Write the code */
        Employee employee1 = new Employee("Walter White", 42, "Manager", 20000);
        Employee employee2 = new Employee("Jesse Pinkman", 32, "Assistant Manager", 12000, 7);
        Employee employee3 = new Employee("Jimmie McGill", 38);
        Employee employee4 = new Employee("Chuck McGill", 40);
        Employee employee5 = new Employee("Walter White", 42, "Manager", 20000);
	
        //Walter Salary 변경
        employee1.setSalary(21000);
        
        //Walter White,Jesse Pinkman 정보 출력
        employee1.outInfo();
        System.out.println();
        employee2.outInfo();
        System.out.println();
        
        //Jimmie,Jesse Pinkman 휴가 10일 신청한 경우
        System.out.println(employee3.vacation(10));
        System.out.println();
        System.out.println(employee2.vacation(10));
        System.out.println();
	
        //Jimmie 정보 출력
        employee3.outInfo();
        System.out.println();
        
        //employee1과 employee2,5의 name,age 비교
        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.equals(employee5));
	}

}
