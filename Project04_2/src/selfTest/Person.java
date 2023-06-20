package selfTest;

public class Person {
	private String name;
	private Date born;
	private Date died;
	
	public Person(String initialName, Date birthDate, Date deathDate) {
		if(consistent(birthDate, deathDate)) {
			name = initialName;
			born = new Date(birthDate);
			if(deathDate == null)
				died = null;
			else
				died = new Date(deathDate);
		}
	}
	
	/* Write the Copy Constructor */
	
	public Person(Person other) {
		this.name = other.name;
		this.born = new Date(other.born);
		if(other.died == null)
			this.died = null;
		else
			this.died = new Date(other.died);
	}
	
	public void set (String newName, Date birthDate, Date deathDate) {
		setName(newName);
		setBirthDate(birthDate);
		setDeathDate(deathDate);
	}
	
	public String toString() {
		String diedString;
		if(died == null)
			diedString = "Now";
		else
			diedString = died.toString();
		
		return (name + ", " + born + " - " + diedString);
	}
	
	public boolean equals(Person otherPerson) {
		if(otherPerson == null)
			return false;
		else
			return (name.equals(otherPerson.name)
					&& born.equals(otherPerson.born)
					&& datesMatch(died, otherPerson.died) ); 
	}
	
	private static boolean datesMatch(Date date1, Date date2) {
		if (date1 == null)
			return (date2 == null);
		else if (date2 == null)
			return false;
		else
			return (date1.equals(date2));
	}
	
	public void setBirthDate(Date newDate) {
		if(consistent(newDate, died))
			born = new Date(newDate);
		else {
			System.out.println("Inconsistent dates. Aborting");
			System.exit(0);
		}
	}
	
	public void setDeathDate(Date newDate) {
		if (!consistent(born, newDate)) {
			System.out.println("Inconsistent dates. Aborting");
			System.exit(0);
		}
		if(newDate == null)
			died = null;
		else
			died = new Date(newDate);
	}
	
	public String getName() {
		return name;
	}
	
	public Date getBirthDate() { //Rewrite to avoid privacy leak
		return new Date(born);
	}
	
	public Date getDeathDate() {
		return new Date(died);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	private static boolean consistent (Date birthDate, Date deathDate) {
		if (birthDate == null)
			return false;
		else if (deathDate == null)
			return true;
		else
			return (birthDate.precedes(deathDate)
					|| birthDate.equals(deathDate));
	}
}
