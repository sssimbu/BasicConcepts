class ExceptionPropagation {
	void m() {
		// throw new java.io.IOException("device error");//checked exception and
		// compile time error
		int data = 50 / 0;
		System.out.println(data);
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.p();
		System.out.println("normal flow");
	}
}