import java.io.*;

public class Operators // class creation
{
	// method creation
	void Arithmetic(int a, int b) {

		System.out.println("Addition" + "-->" + (a + b)); // for output
		System.out.println("sub" + "-->" + (a - b));
		System.out.println("div" + "-->" + (a / b));
		System.out.println("multiple" + "-->" + (a * b));
		System.out.println("mod" + "-->" + (a % b));
	}

	void Relational(int c, int d) {

		if (c == d) // checking if condition
			System.out.println(" a & b are equal");
		else if (c != d)
			System.out.println(" a & b are not equal");

		if (c > d)
			System.out.println(" C is greater than D");
		else if (c < d)
			System.out.println(" C is lesser than D");

		if (c >= d)
			System.out.println(" C is greater or equal than D");

		if (c <= d)
			System.out.println(" C is lesser or equal than D");

	}

	void Bitwise(int e, int f) {

		System.out.println("Result of e,f  is " + (e & f));
		System.out.println(" value of E bitwise OR D in Java : " + (e | f));
		System.out.println(" value of e XOR f in Java : " + (e ^ f));

		e = e << 1; // should be 16 i.e. 0001 0000

		// equivalent of multiplication of 2
		System.out.println("value of e after left shift: " + e);

		e = e >> 1; // should be 16 i.e. 0001 0000

		// equivalent of division of 2
		System.out.println("value of e after right shift with sign: " + e);

	}

	void logical(int g, int h) {

		if (g == 1 && h == 1)
			System.out.println("g,h values are equal to 1");
		else {

			System.out.println("g,h  values are not equal to 1");

		}

		if (g == 1 || h == 1)
			System.out.println("any one value(g&f) is equal to 1");
		else {

			System.out.println("g,h values are not equal to 1");

		}
		if (g != 0)

			System.out.println("g is not zero");

		else
			System.out.println("g is zero");

	}

	void Assignment(int i, int j) {
		i += j; // is equivalent to i = i + j
		System.out.println("i value is(after adding with j)" + i);

		i -= j; // is equivalent to i = i – j

		System.out.println("i value is(after sub with j)" + i);

	}

	void Miscellaneous(int k, int l) {

		k = 10;
		l = (k == 1) ? 20 : 30;
		System.out.println("Value of l is : " + l);

		l = (k == 10) ? 20 : 30;
		System.out.println("Value of l is : " + l);

	}

	void instance() {

		String name = "James";

		// following will return true since name is type of String
		boolean result = name instanceof String;
		System.out.println(result);

	}

	public static void main(String[] args) { // main method

		Operators obj = new Operators(); // object creation
		obj.Arithmetic(2, 2); // method call with value
		obj.Relational(4, 5);
		obj.Bitwise(5, 6);
		obj.logical(1, 10);
		obj.Assignment(3, 5);
		obj.Miscellaneous(5, 10);
		obj.instance(); // method call without value

	}

}