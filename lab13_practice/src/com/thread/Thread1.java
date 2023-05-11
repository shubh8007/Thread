package com.thread;

public class Thread1 extends Thread {
private String fname,lname;

public Thread1(String fname,String lname) {
	this.fname=fname;
	this.lname=lname;
	
}
@Override
public void run() {
	try {
	System.out.println("First name= "+fname);
	Thread.sleep(5000);
	System.out.println("lastNAME= "+lname);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
