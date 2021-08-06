package com.techlab.model;

public class DataService {
	static DataService bucket;
	
//	public void doSomething() {
//		System.out.println("Word done by: "+this.hashCode());
//	}
	
	public static DataService getInstance() {
		if(bucket == null) {
			bucket = new DataService();
		}
		return bucket;
	}
}
