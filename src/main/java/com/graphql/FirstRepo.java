package com.graphql;

import java.util.ArrayList;
import java.util.List;

public class FirstRepo {

	 private List<FirstImpl> firstImplValLst;

	    public FirstRepo() {
	    	firstImplValLst = new ArrayList<>();
	        //add some links to start off with
	    	firstImplValLst.add(new FirstImpl("1stInterfaceVal_01", "1stImplIdVal_01", "1stImplValue_01"));
	    	firstImplValLst.add(new FirstImpl("1stInterfaceVal_02", "1stImplIdVal_02", "1stImplValue_02"));
	    	firstImplValLst.add(new FirstImpl("1stInterfaceVal_03", "1stImplIdVal_03", "1stImplValue_03"));
	    }

	    public List<FirstImpl> getFirstImplValues() {
	        return firstImplValLst;
	    }
	    
}
