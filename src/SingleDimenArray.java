
public class SingleDimenArray {

	int a[] = { 1, 2, 3, 4, 5 };

	void arraymethod() {

		// printing array
		for (int i = 0; i < a.length; i++)// length is the property of array
			System.out.println(a[i]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleDimenArray obj = new SingleDimenArray();
		obj.arraymethod();

	}

}
