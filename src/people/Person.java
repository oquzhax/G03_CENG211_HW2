package people;

import java.security.InvalidParameterException;

import utility.IComparable;

public abstract class Person implements IComparable<Person>{
	private String name;
	private int birthDate;
	private int deathDate;
	private String nationality;
	
	public Person(String name, int birthDate, int deathDate, String nationality) {
		this.name = name;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
		this.nationality = nationality;
	}
	
	public String getName() {
		return name;
	}
	public int getBirthDate() {
		return birthDate;
	}
	public int getDeathDate() {
		return deathDate;
	}
	public String getNationality() {
		return nationality;
	}
	
	@Override
	public int compareTo(Person other, String key) {
		try {
			if(key == "name") {
				return this.name.compareTo(other.getName());
			}
			else if(key == "birthDate") {
				if(this.birthDate < other.getBirthDate()) {return -1;}
				else if(this.birthDate > other.getBirthDate()) {return 1;}
				else {return 0;}
			}
			else if(key == "nationality") {
				return this.nationality.compareTo(other.getNationality());
			}
			else {
				throw new InvalidParameterException();
			}

		}
		catch(NullPointerException e) {
			throw e;
		}
		catch(ClassCastException e) {
			throw e;
		}
	}
}
