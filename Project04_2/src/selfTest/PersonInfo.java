package selfTest;

public class PersonInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person("Juhyun", new Date("March", 29, 1993), null);
		Person person2 = new Person("Hoohyun", new Date("March", 29, 1993), new Date("March", 2, 2018));
		
		Person person3 = new Person(person2); // Modify with Copy Constructor
		
		person3.set("Fakehyun", new Date("March", 29, 1993), new Date("April", 5, 2019));
		
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		System.out.println();
		
		Date fakeDate = person1.getBirthDate();
		fakeDate.setDate("March", 1, 1893);
		System.out.println(person1.toString());
	}
}
