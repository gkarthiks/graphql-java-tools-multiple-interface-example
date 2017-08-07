package com.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

public class Mutation implements GraphQLMutationResolver {
    
	FirstRepo firstRepo = new FirstRepo();
	SecondRepo secondRepo = new SecondRepo();
    public Mutation(FirstRepo firstRepo, SecondRepo secondRepo) {
    	this.firstRepo = firstRepo;
    	this.secondRepo = secondRepo;
    }
    
    public FirstImpl putValInFirst(String firstInterfaceValue, String firstImplId, String firstImplValue) {
        FirstImpl newFirstImpl = new FirstImpl(firstInterfaceValue, firstImplId, firstImplValue);
        firstRepo.saveFirstImpl(newFirstImpl);
        return newFirstImpl;
    }
    
    public SecondImpl putValInSecondImpl(String secondInterfaceValue, String secondImplId, String secondImplValue, String firstInterfaceValue) {
        SecondImpl newSecondImpl = new SecondImpl(secondInterfaceValue, secondImplId, secondImplValue, firstInterfaceValue);
        secondRepo.saveSecondImpl(newSecondImpl);
        return newSecondImpl;
    }
}
