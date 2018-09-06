// super keyword picking the parent class variable

class class1 {
	String color = "white";
}

class child extends class1 {
	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of child class
		System.out.println(super.color);// prints color of class1 class
	}
}

class SuperKeyword {
	public static void main(String args[]) {
		child d = new child();
		d.printColor();
	}
}