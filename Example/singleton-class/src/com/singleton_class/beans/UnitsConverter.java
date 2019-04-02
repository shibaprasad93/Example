package com.singleton_class.beans;

public class UnitsConverter {
	private static UnitsConverter instance;
	private UnitsConverter() {
		//do not remove
	}
	public synchronized static UnitsConverter getInstance() {
		if(instance==null) {
			instance=new UnitsConverter();
		}
		return instance;
	}

}
