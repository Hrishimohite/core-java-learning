package static_nonstatic;

public class Student {
	String firstName; // instance
	String lastName; // instance

	static String collegeName; // static

	public String getFirstName() { // instance
		System.out.println(collegeName);// Access static variable from instance method
		return firstName;
	}

	public String getLastName() { // instance
		System.out.println(firstName);
		System.out.println(lastName);
		return lastName;
	}

	public static String getCollegeName() { // Static
		// System.out.println(firstName);//we can't access instance variable from Static
		// Variable
		return collegeName;
	}

}
