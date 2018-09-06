
/*Abstraction is a process of hiding the implementation details and showing only functionality to the user.

abstract class that has abstract method
*/

package oops_concept;

abstract class abstractex {
	abstract void ss();
}

class AbstractExample extends abstractex {
	void ss() {
		System.out.println("abstract running safely..");

	}

	public static void main(String args[]) {
		abstractex obj = new AbstractExample();
		obj.ss();
	}
}
