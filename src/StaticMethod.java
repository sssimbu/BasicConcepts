class StaticMethod {
	int rollno;
	String name;
	static String college = "static variable";

	static void change() // static method
	{
		college = "static method";
	}

	StaticMethod(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]) {
		StaticMethod.change();

		StaticMethod s1 = new StaticMethod(789, "drfg");
		StaticMethod s2 = new StaticMethod(345, "gthy");
		StaticMethod s3 = new StaticMethod(789, "kilo");

		s1.display();
		s2.display();
		s3.display();
	}
}