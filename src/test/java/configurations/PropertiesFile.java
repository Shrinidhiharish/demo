package configurations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
public static void main(String[] args) {
	
}
public static void getProperties()
{
	
	try {
		Properties prop = new Properties();
		String projectpath = System.getProperty("user.dir");
		InputStream input = new FileInputStream(projectpath+"\\src\\test\\java\\configurations\\config.properties");
	} 
	catch (FileNotFoundException e) 
	{
		System.out.println();
		e.printStackTrace();
	}
}
	
}
