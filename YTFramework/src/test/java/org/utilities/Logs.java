package org.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {
	
	public static void takelog(String classname,String message)
	{
		DOMConfigurator.configure("D:\\Eclipse Workspace\\YTFramework\\layout.xml");
		Logger l=Logger.getLogger(classname);
		l.info(message);
		
	}

}
