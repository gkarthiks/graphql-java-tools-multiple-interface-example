package com.graphql;

public class SecondImpl implements SecondInterface {

	//Interface Variables
	private String secondInterfaceValue;
	
	//Implementation Variables
	private String secondImplId;
	private String secondImplValue;
	
	public SecondImpl(String secondInterfaceValue, String secondImplId, String secondImplValue) {
		this.secondImplId = secondImplId;
		this.secondImplValue = secondImplValue;
		this.secondInterfaceValue = secondInterfaceValue;
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

}
