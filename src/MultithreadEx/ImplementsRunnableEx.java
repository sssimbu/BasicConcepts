package MultithreadEx;

class Simbu implements Runnable {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("it will be print 10 times(child thread)");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ImplementsRunnableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simbu m = new Simbu();

		Thread t = new Thread(m);
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("it will be print 5 times(main thread)");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
