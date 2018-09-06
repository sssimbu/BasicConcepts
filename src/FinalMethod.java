
//If you make any method as final, you cannot override it.

class FinalMethod {

	final void run() {
		System.out.println("running");
	}
}

class sim extends FinalMethod {
	/*
	 * void run() { System.out.println("running safely with 100kmph"); }
	 */

	public static void main(String args[]) {
		sim obj = new sim();
		obj.run();
	}

}