package com.stackroute.datamunger.commander;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import com.niit.datamunger.parser.QueryParser;

public class CommanderTest {

	QueryParser queryParser;
	@Before
	public void init() {
		queryParser=new QueryParser();
	}
	@Test
	public void getOnlyBaseQuery()  {
		
		String expected="select * from Employee.csv";
		String result=queryParser.parseQuery("select * from Employee.csv");
		
		assertEquals(expected, result);
		display("getOnlyBaseQuery",result);
	}
	
	@Test
	public void notgetOnlyBaseQuery()  {
		
		String expected="select * from Employee.csv";
		String result=queryParser.parseQuery("select * from Employee.csv where age>10");
		
		assertNotEquals(expected, result);
		display("notgetOnlyBaseQuery",result);
	}
	private void display(String message, String result) {
		System.out.println(message);
		System.out.println("*************************************");	
		System.out.println(result);
		System.out.println("*************************************");	
	}
	
}
