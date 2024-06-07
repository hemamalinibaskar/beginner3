package youtube3;

class Maths extends Thread {//it create new thread and process on it
	public void run() {//run method must
		
		for(int i=0;i<5;i++) {
			
			System.out.println(i);
			try {
			Thread.sleep(2000);//delay
			}
		
			catch(InterruptedException e) {//exception to catch
			}
		}
	}
}

/*class Science implements Runnable{//runnable interface
	public void run() {//method must be public
		for(int i=0;i<5;i++) {
			System.out.println("NASA");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}*/

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		
		Maths m1 = new Maths();
		//Science s1 = new Science();
		
		Thread t = new Thread(m1);
		
		t.start();
		
		//m1.start();
		if(m1.isAlive()) {//to test whether the thread is alive
			System.out.println("Executing");
		}
		//s1.start();
		
		
		t.join();//to execute the last statement finally
		
		if(m1.isAlive()) {
			System.out.println("Executing");
		}
		
		/*Runnable r = new Runnable() {//Anonymous class
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("NASA");
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						
					}
			}
			}
		};*/
		
		Runnable r = ()-> {//lambda expression
			for(int i=0;i<5;i++) {
				System.out.println("NASA");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					
				}
		}
		};
		
		
	  Thread t1 = new Thread(r);
	  t1.start();
	  
	  t1.join();
		
		System.out.println("Final Statement");
		
	}

}

