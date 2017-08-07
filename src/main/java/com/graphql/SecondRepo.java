package com.graphql;

import java.util.ArrayList;
import java.util.List;

public class SecondRepo {

	 private List<SecondImpl> secondImplValLst;

	    public SecondRepo() {
	    	secondImplValLst = new ArrayList<>();

	    	secondImplValLst.add(new SecondImpl("2ndInterfaceVal_01", "2ndImplIdVal_01", "2ndImplValue_01", "1stInterfaceVal_01"));
	    	secondImplValLst.add(new SecondImpl("2ndInterfaceVal_02", "2ndImplIdVal_02", "2ndImplValue_02", "1stInterfaceVal_01"));
	    	secondImplValLst.add(new SecondImpl("2ndInterfaceVal_03", "2ndImplIdVal_03", "2ndImplValue_03", "1stInterfaceVal_01"));
	    }

	    public List<SecondImpl> getSecondImplValues() {
	        return secondImplValLst;
	    }

	    public void saveSecondImpl(SecondImpl secondImpl) {
	    	secondImplValLst.add(secondImpl);
	    }
}
