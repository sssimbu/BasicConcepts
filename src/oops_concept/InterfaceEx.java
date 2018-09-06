
//It has static constants and abstract methods.

package oops_concept;

interface inn {
	void ee();

}

class InterfaceEx implements inn {

	public void ee() {
		System.out.println("interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx obj = new InterfaceEx();
		obj.ee();

	}

}
