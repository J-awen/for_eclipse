package com.awen.daemon;

public class DaemonThread {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Print(), "print-thread-1");
		// thread1.setDaemon(true);
		thread1.start();
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

	static class Print implements Runnable {

		@Override
		public void run() {
			int i = 0;
			while (true) {
				System.out.println("print:" + ++i);
				/*
				 * try { Thread.sleep(1000); } catch (InterruptedException e) {
				 * e.printStackTrace(); }
				 */
			}
		}

	}

}
