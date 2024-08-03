package org.threadprogram;

import java.util.concurrent.CountDownLatch;

public class CountDownDevA extends Thread {

	private CountDownLatch latch;

	public CountDownDevA(CountDownLatch count, String name) {
		super(name);
		this.latch = count;

	}

	public void run() {
		System.out.println("CountDownDEVA " + Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished the devtools" + Thread.currentThread().getName());
		latch.countDown();

	}

}
