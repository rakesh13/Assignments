package com.niit.datamunger.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class QueryParser {

	public String parseQuery(String query)
	{
		String pattern1 = "select(.*)from(.*)";
		Pattern pattern = Pattern.compile(pattern1);
		String querySelectToFrom = null;
		Matcher matcher = pattern.matcher(query);
		if (matcher.find()) {
			querySelectToFrom=matcher.group();
		}
		return querySelectToFrom;
		
	}
}
