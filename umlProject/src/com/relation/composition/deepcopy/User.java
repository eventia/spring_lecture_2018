package com.relation.composition.deepcopy;




public class User implements Cloneable {
	
	private Address address;
	
	public Address getAddress() throws CloneNotSupportedException {
		return address.clone();
	}
	
	@Override
	protected User clone() throws CloneNotSupportedException {
		//
		User user = new User();
		user.address = this.address.clone();
		return user;
	}
}




