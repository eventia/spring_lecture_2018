package com.relation.composition.shallowcopy;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {

		
		User userA = new User();
		User userB = (User) userA.clone();
		userB.getAddress().setZipCode("111-111");
		
		
	}

}
