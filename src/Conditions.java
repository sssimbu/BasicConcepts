import java.util.Scanner; //importing scanner package

public class Conditions { // class creation

	void ifcondition() // method creation
	{

		int a;

		Scanner s = new Scanner(System.in); // scanner for runtime input
		System.out.println("Enter a value");

		// int input
		a = s.nextInt();

		if (a == 0) {
			System.out.println("a is equal to zero");
		} else if (a == 1) {
			System.out.println("a is equal to one");
		} else if (a == 2) {
			System.out.println("a is equal to two");

		} else if (a == 3) {
			System.out.println("a is equal to three");

		} else {
			System.out.println("a is not equal to above numbers");

		}

	}

	void switchstatement() {

		int no;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any no for choosing case");

		// int input
		no = s.nextInt();

		switch (no) {
		case 1: {

			System.out.println("This is case 1");
			break;
		}

		case 2: {

			System.out.println("This is case 2");
			break;
		}

		case 3: {

			System.out.println("This is case 3");
			break;
		}

		case 4: {

			System.out.println("This is case 4");
			break;
		}

		default:
			System.out.println("Not in above cases");
		}
	}

	void loop() {
		int i;
		String name = "silambarasan";

		for (i = 0; i < 5; i++) {

			System.out.println("It will be print 5 times " + "-->" + name);
		}

		int arr[] = { 5, 6, 7, 8, 9 };
		for (int j : arr) { // for each loop
			System.out.println(j);
		}

		char word[] = { 'a', 'b', 'c', 'd', 'e' };
		for (char k : word) {
			System.out.println(word);
		}

		aa: for (int k = 1; k <= 3; k++) {
			bb: for (int l = 1; l <= 3; l++) {
				if (k == 2 && k == 2) {
					break aa;
				}
				System.out.println(k + " " + l);
			}
		}

		cc: for (int p = 1; p <= 3; p++) {
			dd: for (int q = 1; q <= 3; q++) {
				if (p == 2 && p == 2) {
					break dd;
				}
				System.out.println(p + " " + q);
			}
		}

		/*
		 * for(;;){ System.out.println("infinitive loop"); }
		 */

		int z = 1;
		while (z <= 10) {
			System.out.println("while loop" + "-->" + i);
			z++;
		}

		/*
		 * while(true){ System.out.println("infinitive while loop"); }
		 */

		int x = 1;
		do {
			System.out.println("do while loop" + "-->" + x);
			x++;
		} while (x <= 10);

		/*
		 * do{ System.out.println("infinitive do while loop"); }while(true);
		 */

		for (int y = 1; y <= 10; y++) {
			if (y == 5) {
				break;
			}
			System.out.println(y);
		}

		for (int n = 1; n <= 3; n++) {
			for (int o = 1; o <= 3; o++) {
				if (n == 2 && o == 2) {
					break; // it breaks inner loop
				}
				System.out.println(n + " " + o);
			}
		}

		for (int e = 1; e <= 10; e++) {
			if (e == 5) {
				continue; // 5 will not print
			}
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conditions obj = new Conditions();
		obj.ifcondition();
		obj.switchstatement();
		obj.loop();

	}

}
