package com.wr.thread;

import java.awt.peer.ScrollPanePeer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//两线程交替打印12A34B56C。。。。。。。。
public class Thread01 {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition A = lock.newCondition();
		Condition B = lock.newCondition();

		// A线程打印
		new Thread() {

			public void run() {
				for (int i = 1; i <= 52; i++) {
					lock.lock();
					B.signal();
					System.out.print(i);
					if (i % 2 == 0) {
						try {
							sleep(500);
							A.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						lock.unlock();
					}

				}
			}

		}.start();

		// B线程打印
		new Thread() {
			public void run() {
				for (int i = 0; i < 26; i++) {
					lock.lock();
					A.signal();
			
					System.out.print((char) ('A' + i));
					try {
						sleep(500);
						B.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					lock.unlock();
				}
			}
		}.start();
		
		
		
		

	}
}
