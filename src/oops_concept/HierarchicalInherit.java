package oops_concept;

class Super2 {
	void s1() {
		System.out.println("This is super class");
	}
}

class Subb1 extends Super2 {

	void s2() {

		System.out.println("This is subb1 class");

	}

}

class Subb2 extends Super2 {
	void s3() {

		System.out.println("This is subb2 class");

	}

}

public class HierarchicalInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subb1 obj1 = new Subb1();
		Subb2 obj2 = new Subb2();

		obj1.s1();
		obj1.s2();
		obj2.s3();

	}

}
