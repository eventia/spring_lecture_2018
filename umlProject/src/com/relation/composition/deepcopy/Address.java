package com.relation.composition.deepcopy;

public class Address implements Cloneable {
	
	private String zipCode;

	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	protected Address clone() throws CloneNotSupportedException {
		//
		Address address = new Address();
		address.setZipCode(zipCode);
		return address;
	}
}



