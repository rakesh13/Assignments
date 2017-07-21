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

	
}
