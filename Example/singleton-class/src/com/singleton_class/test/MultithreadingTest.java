package com.singleton_class.test;

import com.singleton_class.beans.Worker;

public class MultithreadingTest {

	public static void main(String[] args) throws InterruptedException {
		Worker worker = new Worker();
		Thread t1=new Thread(worker);
		Thread t2=new Thread(worker);
		t1.start();
		t2.start();
	}

}
