package com.relation.composition.shallowcopy;




public class User implements Cloneable {
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 
		return super.clone();
	}
}




