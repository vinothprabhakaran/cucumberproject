package com.adactin.properties;

import java.io.IOException;

public class File_readManager {
	 private  File_readManager() {
		
	}
	public static File_readManager GetinstantFIR() {
		 File_readManager helper = new File_readManager();
return helper;
	}
public Configuration_Reader GetInstantCR() throws IOException {
	
	Configuration_Reader reader = new Configuration_Reader();
	return reader;
}


}
