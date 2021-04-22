package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
    
public class Configuration_Reader {
	
	  public static Properties p ;
	public Configuration_Reader() throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		p.load(fis);
		
	}
    public static String getbrowsername() {
    String s=p.getProperty("browser");
    return s;
      	
	}
    
    public static String url() {
    String k=	p.getProperty("url");
    return k;

	}
    
}
