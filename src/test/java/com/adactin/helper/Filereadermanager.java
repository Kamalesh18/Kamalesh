package com.adactin.helper;

import java.io.IOException;

public class Filereadermanager {
	private Filereadermanager() {
		
	}
    public static Filereadermanager getinstance() {
     
    	Filereadermanager frm = new Filereadermanager();
    	return frm;
    	
	}
    public Configuration_Reader getcrinstance() throws IOException {
    	Configuration_Reader cr = new Configuration_Reader();
    	return cr;

	}
}
