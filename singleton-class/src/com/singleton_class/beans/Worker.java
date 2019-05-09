package com.singleton_class.beans;

public class Worker implements Runnable {

	@Override
	public void run() {
		UnitsConverter unitsConverter=null;
		unitsConverter=UnitsConverter.getInstance();
		System.out.println(unitsConverter.hashCode());
		try {
			Thread.sleep(1000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <=50; i++) {
			System.out.println(i);
			
		}

	}

}
