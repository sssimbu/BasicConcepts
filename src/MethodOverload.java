
/*There are two ways to overload the method in java

By changing number of arguments
By changing the data type*/

public class MethodOverload {

	void method(int a, int b) {

		System.out.println("ans is " + " " + (a + b));

	}

	void method(int a, int b, String value) {

		System.out.println("ans is " + " " + (a + b) + " " + value);

	}

	public static void main(String[] args) {
		MethodOverload obj = new MethodOverload();
		obj.method(2, 3);
		obj.method(4, 5, "simbu");

	}

}
