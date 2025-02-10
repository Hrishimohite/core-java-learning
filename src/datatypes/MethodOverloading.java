package datatypes;

public class MethodOverloading {
	// function overloading
	public static void main(String[] args) {
		quadratic(8);// parameter
		quadratic();
		quadratic("Hrx");
		quadratic("Helo", "world");
		quadratic(34, 24);
		quadratic("hello", 65);
		quadratic(632, "timepass");

	}

	public static void quadratic() {// Argument user defined function definition
		System.out.println("output is timepass");// println=> function call

	}

	public static void quadratic(int a) { // function with same name but different parameter
		System.out.println("output is timepasss");
	}

	public static void quadratic(String a) {
		System.out.println("output is timepasss");
	}

	public static void quadratic(String a, String b) {
		String c = a + b;
		System.out.println("output is " + c);
	}

	public static void quadratic(int a, int b) {
		int c = a + b;
		System.out.println("output is " + c);
	}

	public static void quadratic(String a, int b) {

		System.out.println("output is ");
	}

	public static void quadratic(int a, String b) {

		System.out.println("output is ");
	}
}
