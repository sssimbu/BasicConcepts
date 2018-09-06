
/*method must have same name as in the parent class
method must have same parameter as in the parent class.
must be IS-A relationship (inheritance).*/

class Parent {

	void method() {
		System.out.println("parent class");
	}
}

class MethodOveride extends Parent {
	void method() {
		System.out.println("child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent obj = new MethodOveride();
		obj.method();

	}

}
