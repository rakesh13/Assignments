package com.stackroute.datamunger.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.datamunger.query.Query;
import com.stackroute.datamunger.query.QueryParser;
import com.stackroute.datamunger.restrictions.Restriction;

public class DataMungerTest {

	static Query query;
	@BeforeClass
	public static void init()
	{
		query=new Query();
	}
	
	@Test
	public void testWhereWithMultipleConditions()
	{
		QueryParser queryParser=query.executeQuery("select * from Employee.csv where dept=HR and Salary>=35000");
		assertEquals(2,queryParser.getRestrictionList().size());
		display("testWhereWithMultipleConditions",queryParser);
	}

	private void display(String string, QueryParser queryParser) {
		 List<Restriction> restrictions=queryParser.getRestrictionList();
	     int count=1;
	     for(Restriction restriction : restrictions)
	     {
	    	 System.out.println("Restriction - "+count);
	    	 System.out.println("PropertyName :"+restriction.getPropertyName());
	    	 System.out.println("PropertyValue :"+restriction.getPropertyValue());
	    	 System.out.println("conditionalOperator :"+restriction.getConditionalOperator());
	    	 count++;
	     }
	}
}
