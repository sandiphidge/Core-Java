package Learning.Multithreading;

class Demo extends Thread{
	public void run() { //Running
		System.out.println("Hello from thread");
		try {
			Thread.sleep(1000); //Wait
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After sleep");
	}
}

public class LifeCycleIntro {

	public static void main(String[] args) {
		Demo d = new Demo();//New
		d.start(); //Runnable
	}

}

//code completes execution called as termination
