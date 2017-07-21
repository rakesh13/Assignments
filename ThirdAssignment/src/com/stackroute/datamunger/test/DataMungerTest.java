package com.stackroute.datamunger.test;

import static org.junit.Assert.*;

import java.util.*;
import java.io.IOException;

import org.junit.*;

import com.stackroute.datamunger.CsvFileReader;

public class DataMungerTest {
	CsvFileReader csvFileReader;
		
	@Before
	public void objectCreator()
	{
		csvFileReader=new CsvFileReader();
	}
	

	@Test
	public void printRow() throws IOException
	{
		List<String> rows=csvFileReader.rowData();
		assertTrue(rows.size()>0);
		display(rows);
	}
	
	private void display(List<String> rows) {
		// TODO Auto-generated method stub
		Iterator i=rows.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());
		}
	}

		
		

		
}
