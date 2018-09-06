
public class StringExtra {

	String s = "simbu"; // by literal method

	void ss() {
		System.out.println("1st String value(By literal method)" + s);

	}

	void StringFunc(String k) {
		System.out.println(k.toLowerCase());
		System.out.println(k.toUpperCase());
		System.out.println(k.trim());
		System.out.println(k.replace(k, "replacedString"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("silambarasan"); // by new keyword
		System.out.println("String value(By new key word)" + a);

		StringExtra obj = new StringExtra();
		obj.ss();
		obj.StringFunc("    sIlAmBarAsAn SimbU   ");
	}
}
