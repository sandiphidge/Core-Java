package Learning.Multithreading;

class MyThread1 implements Runnable{
	public void run() {
		System.out.println("Thread executed method");
	}
}


public class Test2 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		Thread th = new Thread(t1);
		th.start();

	}

}
