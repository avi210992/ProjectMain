package Package4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DemoTest1 {
	Properties prop1;
	FileInputStream fis ;
		@Test
		void m1() throws FileNotFoundException, IOException
		{
		 prop1 = new Properties();
			prop1.load(new FileInputStream("C:\\Users\\SONY\\eclipse-workspace\\ProjectMain\\src\\main\\resources\\Data.properties"));
	System.out.println(prop1.get("task"));
	System.out.println(System.getProperty("Work"));
		}
		
		@Test (dataProvider = "dataP1")
		public void m3(HashMap<String,String> map)
		{
			
			System.out.println("in  Package1 Test1 class and Testmethod m3");
			System.out.println("Name of the person is  " + map.get("name") + " and Age of person is   " + map.get("age"));
		}
		

		@DataProvider (name = "dataP1")
		public Object[][] data() throws IOException
		{
			
			Object[][] arr1;
			List<HashMap<String,String>> al1 = ReadJsondata.func();
			arr1= new Object[][] {{al1.get(0)},{al1.get(1)}, {al1.get(2)}};
			return arr1;
		
		}
		
	
}
