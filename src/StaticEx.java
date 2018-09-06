/*
static can be:

variable (also known as class variable)
method (also known as class method)
block
nested class*/

//Program of static variable  

class StaticEx {
	int rollno;
	String name;
	static String college = "simbu"; // static variable

	StaticEx(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	static {
		System.out.println("static block is invoked");
	}

	public static void main(String args[]) {
		StaticEx s1 = new StaticEx(88, "abc");
		StaticEx s2 = new StaticEx(567, "def");

		s1.display();
		s2.display();
	}
}
