package org.fullstack;


interface Lambda{
	public void demo();
	//public void demo2(int x);
}

public class App {

	public static void main(String[] args) {
		
		Lambda lambda = ()->{
			System.out.println("Statement 1");
			System.out.println("Statement 2");
		};
		lambda.demo();
		

	}

}
