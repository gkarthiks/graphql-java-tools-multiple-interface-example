package com.graphql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

	private static final long serialVersionUID = 1L;

	public GraphQLEndpoint() {
        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {
    	FirstRepo firstRepository = new FirstRepo();
    	SecondRepo secondRepository = new SecondRepo();
    	
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(firstRepository, secondRepository), new Mutation(firstRepository, secondRepository))
                .build()
                .makeExecutableSchema();
    }
}
