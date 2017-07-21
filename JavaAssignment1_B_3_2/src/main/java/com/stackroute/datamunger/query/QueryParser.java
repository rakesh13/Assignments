package com.stackroute.datamunger.query;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.datamunger.restrictions.Restriction;

public class QueryParser {
	

	private List<Restriction> restrictionList=new ArrayList<>();
	private String whereCondition;
	List<String> logicalOperators= new ArrayList<>();
	
	
	public List<Restriction> getRestrictionList() {
		return restrictionList;
	}

	public void setRestrictionList(List<Restriction> restrictionList) {
		this.restrictionList = restrictionList;
	}
    
	public List<String> getLogicalOperators() {
		return logicalOperators;
	}

	public void setLogicalOperators(List<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}

	public QueryParser parseQuery(String query)
	{
		whereCondition=query.split("where")[1];
		getRelationalAndLogicalOperators(whereCondition);
	
		return this;
	}

	private void getRelationalAndLogicalOperators(String whereCondition) {
		String relationalOperators[]=whereCondition.split("and|or");
		
		for(String relationCondition:relationalOperators)
		{
			Restriction restriction = new Restriction();
			relationCondition=relationCondition.trim();
			String columnAndValue[] = relationCondition.split("([!|=|>|<])+");
			String columnName=columnAndValue[0].trim();
			String columnValue =columnAndValue[1].trim();
			int startIndex = relationCondition.indexOf(columnName) + columnName.length();
			int endIndex = relationCondition.indexOf(columnValue);
			String operator = relationCondition.substring(startIndex, endIndex).trim();
			restriction.setPropertyName(columnName);
			restriction.setPropertyValue(columnValue);
			restriction.setConditionalOperator(operator);
			restrictionList.add(restriction);
		}
		if(relationalOperators.length>1)
			logicalOperatorList(whereCondition);
	}

	private void logicalOperatorList(String whereCondition) {
		String checkForLogicalOperators[]=whereCondition.split("\\s+");
		for(String logicalOperator : checkForLogicalOperators)
		{
			if(logicalOperator.trim().equals("and") || logicalOperator.trim().equals("or"))
			{
				logicalOperators.add(logicalOperator);
			}
		}
		
	}
	
}
