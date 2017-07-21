package com.stackroute.datamunger.parser;

public class QueryParser {

	public String[] parseQuery(String query)
	{
		String[] splitQuery=query.split(" ");
		return splitQuery;
		
	}
}
