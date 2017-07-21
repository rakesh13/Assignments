package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvFileReader {

	public List<String> allDataReader() throws IOException {
		BufferedReader buffer;
		buffer = new BufferedReader(new FileReader("resources\\emp.csv"));
		List<String> list = new ArrayList<String>();
		String line = buffer.readLine();
		while (line != null) {
			list.add(line);
			line = buffer.readLine();

		}

		return list;
	}

	public String headerData() throws IOException {
		String header = allDataReader().get(0);
		return header;
	}
	
	
	public List<String> rowData() throws IOException
	{
		List<String> rows=new ArrayList<>(allDataReader().subList(1,allDataReader().size()));
		return rows;
	}
}
