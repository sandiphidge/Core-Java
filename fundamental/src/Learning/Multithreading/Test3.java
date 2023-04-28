package Learning.Multithreading;


class Custom implements Runnable{
	
	public void run() {
		System.out.println("Run method executed");
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		Custom c1 = new Custom();
		Custom c2 = new Custom();
		Thread th = new Thread (c1);
		Thread th2 = new Thread (c2);
		th.start();
	    th2.start();
	}

}
