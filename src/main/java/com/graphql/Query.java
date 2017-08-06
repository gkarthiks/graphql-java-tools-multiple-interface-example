package com.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Query implements GraphQLRootResolver {
    
    private final FirstRepo firstRepository;
    private final SecondRepo secondRepository;

    public Query(FirstRepo firstRepository, SecondRepo secondRepository) {
        this.firstRepository = firstRepository;
        this.secondRepository = secondRepository;
    }

    public List<FirstImpl> getFirstImplValues() {
        return firstRepository.getFirstImplValues();
    }
    
    public List<SecondImpl> getSecondImplValues() {
        return secondRepository.getSecondImplValues();
    }
}