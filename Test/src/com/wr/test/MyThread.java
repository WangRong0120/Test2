package com.wr.test;

public class MyThread implements Runnable{
	private int i;
	private int j;

	@Override
	public synchronized void run() {
		for(;;) {
			i++;
			j++;
			System.out.println("i="+i+";j="+j);
			
		}
		
	}

	public static void main(String[] args) {
		MyThread t=new MyThread();
		new Thread(t).start();
		new Thread(t).start();
	}
}
