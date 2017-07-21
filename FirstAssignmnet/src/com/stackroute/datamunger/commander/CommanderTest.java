package com.stackroute.datamunger.commander;

public class CommanderTest {
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
