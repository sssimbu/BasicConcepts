package oops_concept;

// run one action in multiple ways

class Parent {
	public void methodA() // Base class method
	{
		System.out.println("hello, I'm methodA of class Parent");
	}
}

class Child extends Parent {
	public void methodA() // Derived Class method
	{
		System.out.println("hello, I'm methodA of class Child");
	}
}

public class RuntimePoly {
	public static void main(String args[]) {
		Parent obj1 = new Parent(); // Reference and object Parent
		Parent obj2 = new Child(); // Parent reference but Child object
		obj1.methodA();
		obj2.methodA();
	}
}
