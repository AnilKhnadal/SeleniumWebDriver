package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		// location of properties file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\config.properties");
		
		// loading properties file
		// Create object of Properties class
		Properties propertiesobj=new Properties();
		propertiesobj.load(file);
		
		// Reading data from properties file
		String url = propertiesobj.getProperty("appurl");
		String email = propertiesobj.getProperty("email");
		String pwd = propertiesobj.getProperty("password");
		String orid = propertiesobj.getProperty("orderid");
		String cusid = propertiesobj.getProperty("customerid");
		
		System.out.println(url+" "+email+" "+pwd+" "+orid+" "+cusid);
		
		// reading all the keyys from the properties file
		Set<String> keys = propertiesobj.stringPropertyNames();
		System.out.println(keys); // [password, orderid, customerid, appurl, email]

		Set<Object> keySet = propertiesobj.keySet();
		System.out.println(keySet); // [password, orderid, customerid, appurl, email]
		
		// reading only all the value from properties value
		Collection<Object> values = propertiesobj.values();
	
		System.out.println(values); // [abcxyz, 123, 234, https://demo.opencart.com/, abc@gmail.com]
		
		file.close();
	
	}
}
