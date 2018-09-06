import java.io.*;

public class Test // class creation
{

	// method creation
	void primitive() {

		// Declaring data types

		int a = 128, b = 128; // int Datatype
		float c = (float) 5.3; // float Datatype
		float d = (float) 2.6;
		double e = 331.79; // double Datatype
		double f = 331.79;
		long g = 5110, h = 2134; // long Datatype
		byte i = 5, j = 5; // byte Datatype
		short k = 22, l = 245; // short Datatype
		boolean m; // boolean Datatype
		char n = 's'; // char Datatype
		String o = "simbu"; // String Datatype

		// for output we have to create Sys out

		System.out.println("Addition(int)" + "-->" + (a + b));
		System.out.println("Addition(float)" + "-->" + (c + d));
		System.out.println("Addition(double)" + "-->" + (e + f));
		System.out.println("subraction(long)" + "-->" + (g - h));
		System.out.println("multiple(byte)" + "-->" + (i * j));
		System.out.println("division(short)" + "-->" + (k * l));
		System.out.println("modulus(int)" + "-->" + (a % b));
		System.out.println("char" + "-->" + n);
		System.out.println("string" + "-->" + o);

		m = true; // assigning value for boolean variable

		System.out.println("boolean m is" + "-->" + m);

		if (m) // if condition for boolean variable
		{
			System.out.println("boolean m is" + "-->" + m);

		} else {

			System.out.println("(boolean m is false");

		}

	}

	// method creation

	void nonprimitive()

	{

		int p[] = { 1, 2, 3, 4, 5 };
		char q[] = { 'a', 'b', 'c', 'd', 'e' };

		System.out.println("(Array(int)" + "-->" + p[0]);
		System.out.println("(Array(char)" + "-->" + q[2]);

	}

	// method creation for object decleration and asigning value in main class

	void data(String r) {

		System.out.println("Seperate method" + "-->" + r); // for output

	}

	public static void main(String[] args) {

		Test obj = new Test(); // object creating

		obj.primitive(); // method call
		obj.nonprimitive();
		obj.data("silambarasan"); // method call with assigning value

		String num = "fullcreative";
		// if(num ="")
		// {
		// }

	}

}