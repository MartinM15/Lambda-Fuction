package org.fullstack.app1;

public class App1 {

	public static void main(String[] args) {
		
		/*Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I am inside thread 1");
				
			}
		});*/
		
		
		Thread thread1 = new Thread(()-> System.out.println("I am inside thread 1"));
		Thread thread2 = new Thread(()->{ 
			
			System.out.println("I am inside thread 1");
			System.out.println("I am inside thread 2");
		
				});
	
		
		thread1.start();
		thread2.start();

	}

}
