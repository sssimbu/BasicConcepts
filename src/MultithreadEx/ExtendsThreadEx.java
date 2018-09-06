package MultithreadEx;

class sim extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
	
			System.out.println("child thread" + " " + i);
		}
	}
}

public class ExtendsThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sim obj = new sim();
		obj.start();
		for (int i = 0; i < 4; i++) {
			System.out.println("main thread" + i);
		}

	}

}
