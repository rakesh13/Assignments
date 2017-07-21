package com.stackroute.datamunger.commander;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.stackroute.datamunger.CsvFileReader;

public class CommanderTest {

	
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
