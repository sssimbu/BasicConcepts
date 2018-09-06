import java.io.IOException;

public class TypeExceptionEx {

	void ArithmeticEx() {
		try {
			int a = 1 / 0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	void NullPointerEx() {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	void NumberFormatEx() {
		try {
			String s = "abc";
			int i = Integer.parseInt(s);// NumberFormatException
		} catch (Exception e) {
			System.out.println(e);

		}
	}

	void ArrayIndexOutOfBoundsEx() {
		try {
			int b[] = new int[5];
			b[10] = 50; // ArrayIndexOutOfBoundsException
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	void NestedTryBlock() {
		try {

			System.out.println("inside of first try block");

			try {
				System.out.println("inside of second try block");
			} catch (Exception e) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	void FinallyEx() {

		try {
			int a = 1 / 0;
			System.out.println(a);
			String n = "try";
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}

	}

	void ThrowKeyword(int age) {
		if (age >= 18) {
			System.out.println("Welcome to vote");
		} else {
			throw new ArithmeticException("not valid");

		}

	}
	
	 void method() throws IOException
	 {  
		  throw new IOException("device error");  
	 }  
		

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TypeExceptionEx obj = new TypeExceptionEx();
		obj.ArithmeticEx();
		obj.NullPointerEx();
		obj.NumberFormatEx();
		obj.ArrayIndexOutOfBoundsEx();
		obj.NestedTryBlock();
		obj.FinallyEx();
		obj.ThrowKeyword(12);
		obj.method();

	}

}

