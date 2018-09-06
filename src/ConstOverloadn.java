
//Constructor Overloading
public class ConstOverloadn {

	int id;
	String name;
	int age;

	ConstOverloadn(int i, String n) // constructor creation
	{
		id = i;
		name = n;
	}

	ConstOverloadn(int i, String n, int a) { // one more constructor with same
												// name
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) // main method
	{
		ConstOverloadn s1 = new ConstOverloadn(345, "srrk");
		ConstOverloadn s2 = new ConstOverloadn(345, "frgth", 255);
		s1.display();
		s2.display();
	}

}
