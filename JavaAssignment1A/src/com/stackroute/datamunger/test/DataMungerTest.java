package com.stackroute.datamunger.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.stackroute.datamunger.parser.QueryParser;

public class DataMungerTest {

	QueryParser queryParser;
	@Before
	public void init()
	{
		queryParser=new QueryParser();
	}
	
	@Test
	public void splitQueryToWord()
	{
		String[] expected={"select","*","from","employee.csv","where","department","=","'hr'","and","salary",">=","3000"};
		String[] result=queryParser.parseQuery("select * from employee.csv where department = 'hr' and salary >= 3000");
		assertArrayEquals(expected, result);
		display("splitQueryToWord",result);
	}

	private void display(String msg,String[] result) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		System.out.println("**************************************");
		for(String data:result)
		System.out.print(data+",");
		System.out.println("\n**************************************");
		
	}
}

