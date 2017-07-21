package com.stackroute.datamunger.parser;

public class QueryParser {

	public String[] parseQuery(String query)
	{
		int i=0;
		String[] whereConditon;
		String[] splitQuery=query.split("where");
		whereConditon=splitQuery[1].trim().split(" ");
		
		return whereConditon;
		
	}
}
