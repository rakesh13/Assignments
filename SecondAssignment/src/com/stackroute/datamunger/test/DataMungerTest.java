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
