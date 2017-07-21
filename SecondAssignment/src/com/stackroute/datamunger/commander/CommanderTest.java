package com.stackroute.datamunger.commander;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

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
	public void printHeader() throws IOException
	{
		String header=csvFileReader.headerData();
		assertTrue(header.length()>0);
		display(header);
	}
	
	private void display(String data) {
		// TODO Auto-generated method stub
		System.out.println(data);
	}

}
