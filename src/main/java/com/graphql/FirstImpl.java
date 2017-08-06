package com.graphql;

public class FirstImpl implements FirstInterface {

	//Interface Variable
	private String firstInterfaceValue;
	
	//Implementation Values
	private String firstImplId;
	private String firstImplValue;
	
	public FirstImpl(String firstInterfaceValue, String firstImplId, String firstImplValue) {
		this.firstImplId = firstImplId;
		this.firstImplValue = firstImplValue;
		this.firstInterfaceValue = firstInterfaceValue;
	}

	@Override
	public String getFirstInterfaceValue() {
		return firstInterfaceValue;
	}

	public String getFirstImplId() {
		return firstImplId;
	}

	public String getFirstImplValue() {
		return firstImplValue;
	}

}
