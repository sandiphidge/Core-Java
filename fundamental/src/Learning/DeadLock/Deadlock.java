package Learning.DeadLock;

class Resource{
	String resource1 = "r1";
	String resource2 = "r2";

	Thread T1 = new Thread(new Runnable(){

		@Override
		public void run() {
			System.out.println("T1 starts..");
			synchronized(resource1){
				System.out.println("T1 acquired the lock of resource1");
				System.out.println("Waiting for resource2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}synchronized(resource2){
					System.out.println("T1 acquired the lock of resource2");
				}

			}
			System.out.println("T1 completed task...");
		}

	});

	Thread T2 = new Thread(new Runnable(){

		@Override
		public void run() {
			System.out.println("T2 starts..");
			synchronized(resource2){
				System.out.println("T2 acquired the lock of resource2");
				System.out.println("Waiting for resource1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}synchronized (resource1) {
					System.out.println("T2 acquired the lock of resource1");
				}
			}
			System.out.println("T2 completed task");
		}

	});
}

public class Deadlock {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" started the program");
		Resource obj = new Resource();
		obj.T1.start();
		obj.T2.start();


		System.out.println(Thread.currentThread().getName()+" terminates..");;

//
//public class Deadlock {


//		     Object t1 = new Object();
//		     Object t2 = new Object();
//		    
//		    public void method1() {
//		        synchronized (t1) {
//		            System.out.println( "lock t1");
//		            try {
//		                Thread.sleep(1000);
//		            } catch (InterruptedException e) {
//		                e.printStackTrace();
//		            }
//		            synchronized (t2) {
//		                System.out.println("lock t1 and t2");
//		            }
//		        }
//		    }
//		    
//		    public void method2() {
//		        synchronized (t2) {
//		            System.out.println("lock t2");
//		            try {
//		                Thread.sleep(1000);
//		            } catch (InterruptedException e) {
//		                e.printStackTrace();
//		            }
//		            synchronized (t1) {
//		                System.out.println("lock t1 and t2");
//		            }
//		        }
//		    }
//		    
//		    public static void main(String[] args) {
//		        Deadlock deadlock = new Deadlock();
//		        
//		        Runnable task1 = () -> deadlock.method1();
//		        Runnable task2 = () -> deadlock.method2();
//		        
//		        Thread t1 = new Thread(task1);
//		        Thread t2 = new Thread(task2);
//		        
//		        t1.start();
//		        t2.start();
		    }
		
	}


