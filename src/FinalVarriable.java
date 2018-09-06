
public class FinalVarriable {
	final int speedlimit = 100;// final variable

	void ss() {
		// speedlimit=400; // if u already assigned the final variable value ..
		// it can't changable one
		System.out.println(speedlimit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalVarriable obj = new FinalVarriable();
		obj.ss();

	}

}
