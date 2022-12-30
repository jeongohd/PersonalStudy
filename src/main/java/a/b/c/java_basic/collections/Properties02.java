package a.b.c.java_basic.collections;

import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Properties02 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		// 파일 생성 후 저장. 
		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example");
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
