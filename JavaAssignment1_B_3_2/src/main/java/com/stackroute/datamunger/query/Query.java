package com.stackroute.datamunger.query;

public class Query {

	public QueryParser executeQuery(String query)
	{
		QueryParser queryParser= new QueryParser();
		queryParser.parseQuery(query);
		return queryParser;
	}
}
