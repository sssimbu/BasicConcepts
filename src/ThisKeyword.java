//this can be used to refer current class instance variable.

public class ThisKeyword {

	int no;
	String name;
	float fee;

	ThisKeyword(int no, String name, float fee) {
		this.no = no;
		this.name = name; // if u use without this keyword for this program, it
							// will take null value
		this.fee = fee;
	}

	void display() {
		System.out.println(no + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword s1 = new ThisKeyword(234, "sss", 5.09f);
		ThisKeyword s2 = new ThisKeyword(456, "fff", 6.90f);
		s1.display();
		s2.display();

	}

}
