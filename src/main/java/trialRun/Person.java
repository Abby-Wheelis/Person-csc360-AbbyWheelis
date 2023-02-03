package trialRun;

public class Person
{
	//attributes
	String firstName;
	String lastName;
	int age;
	
	/** constructor
	 * @param fname - First Name
	 * @param lname - Last Name
	 * @param age - age of person in Years
	 */
	public Person(String fname, String lname, int age)
	{
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}

	/**
	 * @return the fname - first name of the person
	 */
	public String getFname()
	{
		return firstName;
	}
	
	/**
	 * @param fname the fname to set  - set the first name of the person to the new one given
	 */
	public void setFname(String fname)
	{
		this.firstName = fname;
	}

	/**
	 * @return the lname - last name of the person
	 */
	public String getLname()
	{
		return lastName;
	}

	/**
	 * @param lname the lname to set - set the last name of the person to the new one given
	 */
	public void setLname(String lname)
	{
		this.lastName = lname;
	}

	/**
	 * @return the age - age of the person
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set - set the age of the person to the new one given
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/**
	 * to string function - Person: firstName lastName, age
	 */
	@Override
	public String toString()
	{
		return "Person: " + firstName + " " + lastName + ", " + age;
	}
	
	/*
	 * function to create a new person with another person
	 * Receives this person's first name, that person's last name and an age of 0
	 * the new person is returned
	 * 
	 * throws under age exception if either "parent" has an age < 18
	 */
	public Person makePerson(Person that) throws UnderAgeException
	{
		if(age < 18 || that.age < 18)
		{
			throw new UnderAgeException();
		}
		Person child = new Person(this.firstName, that.lastName, 0);
		
		return child;
	}
	
	/*
	 * Main function: creates a person and prints them 
	 * for initial test - more extensive testing in PersonTest
	 */
	public static void main(String[] args)
	{
		Person p = new Person("Abby", "Wheelis", 21);
		
		System.out.println("A: " + p);
	}

}
