class FinalizeEx {
	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {
		FinalizeEx f1 = new FinalizeEx();
		FinalizeEx f2 = new FinalizeEx();
		// System.out.println(f2);
		f1 = null;
		f2 = null;
		// System.out.println(f2);
		System.gc();
	}
}