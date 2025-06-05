package com.srikanth.allPrograms;

import org.hibernate.annotations.Synchronize;

public class SynchronisedKeyword {
	static int c = 0;

	public static synchronized void increment() {
		System.out.println(c++);
	}

	public static int getCount() {
		return c;
	}

	public static void main(String[] args) {
		// Create two threads that increment the count
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				SynchronisedKeyword.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				SynchronisedKeyword.increment();
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// Wait for both threads to finish if you not use then it will execute line by
		// line , if u use its wait for to complete the thread
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Print final count
		System.out.println("Final count: " + SynchronisedKeyword.getCount());

	}

}
