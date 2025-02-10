package datatypes;

public class BinomialEquations {

	public static void main(String[] args) {// main function
		quadratic(5, 4); // function call
		qubic(2, 4);
		quartic(1, 2);
		quintic(2, 4);
	}

	public static void quadratic(int a, int b) { // function definition
		int c = a * a + (2 * a * b) + b * b; // function
		System.out.println("the output is : " + c); // function call
	}

	public static void qubic(int a, int b) {// function definition
		int c = a * a * a;
		c = 3 * a * a * b;
		c = 3 * a * b * b;
		c = b * b * b;

		System.out.println("the output is :" + c);

	}

	public static void quartic(int a, int b) {

		int c = a * a * a * a;
		c = 4 * a * a * a * b;
		c = 6 * a * a * b * b;
		c = 4 * a * b * b * b;
		c = b * b * b * b;
		System.out.println("the output is :" + c);
	}

	public static void quintic(int a, int b) {
		int c = a * a * a * a * a;
		c = 5 * a * a * a * a * b;
		c = 10 * a * a * a * b * b;
		c = 5 * a * b * b * b * b;
		c = b * b * b * b * b;
		System.out.println("the output is : " + c);
	}

}
