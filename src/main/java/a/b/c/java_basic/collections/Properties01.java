package a.b.c.java_basic.collections;

import java.util.Enumeration;
import java.util.Properties;

public class Properties01 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		Enumeration e = prop.propertyNames(); // prop에 저장된 요소들을 Enumeration을 통해 출력.
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + " = " + prop.getProperty(element)); // 키, 값 출력 
		}
		
		System.out.println();
		prop.setProperty("size", "20");
		System.out.println("size = "+prop.getProperty("size"));
		System.out.println("capacity = "+ prop.getProperty("capacity","20"));
		System.out.println("loadfactor = "
				+ prop.getProperty("loadfactor","0.75")); // 값이 없으면 지정 가능. 추가는 안 됨. 
		
		System.out.println();
		System.out.println(prop);
		prop.list(System.out);
		
	}

}
