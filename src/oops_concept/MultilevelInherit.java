package oops_concept;

class Super1 {
	void s1() {
		System.out.println("This is super class");
	}
}

class Sub1 extends Super1 {

	void s2() {

		System.out.println("This is sub1 class");

	}

}

class Sub2 extends Sub1 {
	void s3() {

		System.out.println("This is sub2 class");

	}

}

class Sub3 extends Sub2 {

	void s4() {

		System.out.println("This is sub3 class");

	}

}

public class MultilevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub3 obj = new Sub3();
		obj.s1();
		obj.s2();
		obj.s3();
		obj.s4();

	}

}
