package com.graphql;

public class ThirdImpl implements SecondInterface, FirstInterface {

	//Interface Variables
	private String secondInterfaceValue;
	
	//First Interface Value
	private String firstInterfaceValue;
	
	//Implementation Variables
	private String secondImplId;
	private String secondImplValue;
	
	public ThirdImpl(String secondInterfaceValue, String secondImplId, String secondImplValue, String firstInterfaceValue) {
		this.secondImplId = secondImplId;
		this.secondImplValue = secondImplValue;
		this.secondInterfaceValue = secondInterfaceValue;
		this.firstInterfaceValue = firstInterfaceValue;
	}

	@Override
	public String getSecondInterfaceValue() {
		return secondInterfaceValue;
	}

	public String getSecondImplId() {
		return secondImplId;
	}

	public String getSecondImplValue() {
		return secondImplValue;
	}

	@Override
	public String getFirstInterfaceValue() {
		return firstInterfaceValue;
	}

}
