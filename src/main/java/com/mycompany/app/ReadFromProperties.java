package com.mycompany.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		FileInputStream readProp = null;
		
		try {
			readProp = new FileInputStream("app.properties");
			prop.load(readProp);
			
			System.out.println(prop.getProperty("username1"));
			System.out.println(prop.getProperty("password"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(readProp !=null) {
				try {
					readProp.close();
				} catch (Exception e2) {
					System.out.println("Could not close the file");
				}
			}
		}

	}

}
