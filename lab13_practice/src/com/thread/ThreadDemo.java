package com.thread;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("Current Thread= "+Thread.currentThread().getName());
		
		Thread1 t1=new Thread1("Shubham","suryawanshi");
		Thread1 t2=new Thread1("mohit","lokhande");
		System.out.println("_______________");
		t1.getState();
		Thread1 t3=new Thread1("somesh","prem");
		Thread1 t4=new Thread1("prajyot","pawar");

		
		t1.start();
		t2.start();
		System.out.println("_______________");
		t1.getState();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println("main over...");
	}

}
