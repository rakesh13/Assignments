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
		public void printData() throws IOException
		{
			List<String> datas=csvFileReader.allDataReader();
			assertNotNull(datas);
			display(datas);
		}


		private void display(List<String> datas) {
			// TODO Auto-generated method stub
			Iterator i=datas.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			 
		}
		
		

		
}
