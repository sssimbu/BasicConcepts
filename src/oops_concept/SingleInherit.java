package oops_concept;

class SuperClass {

	int a = 5;

	void ss() {
		System.out.println("a value is" + " " + a);
	}

}

class SubClass extends SuperClass {
	int b = 50;

	void kk() {
		System.out.println("b value is" + " " + b);
	}

}

public class SingleInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass obj = new SubClass();
		obj.ss();
		obj.kk();

	}

}
