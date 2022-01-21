package com.mycompany.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteIntoProperties {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		OutputStream writeProp = null;
		
		try {
			writeProp = new FileOutputStream("app.properties", true);
			
			prop.setProperty("url", "https://google.com");
			prop.setProperty("username", "myUser123");
			prop.setProperty("password", "Pa$$word1");
			prop.setProperty("dbUser", "AdminSQL");
			
			prop.store(writeProp, null);
			System.out.println("Wrote into properties successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(writeProp != null) {
				try {
					writeProp.close();
				} catch (IOException e) {
					System.out.println("Could not close the OutputStream");
				}
			}
			
		}

	}

}
