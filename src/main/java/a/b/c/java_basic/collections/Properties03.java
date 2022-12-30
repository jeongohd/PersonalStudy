package a.b.c.java_basic.collections;

import java.util.Enumeration;
import java.util.Properties;

public class Properties03 {

	public static void main(String[] args) {
		
		Properties sysProp = System.getProperties();
		System.out.println(sysProp.getProperty("java.version"));
		System.out.println(sysProp.getProperty("user.language"));
		sysProp.list(System.out);
		
	}

}
