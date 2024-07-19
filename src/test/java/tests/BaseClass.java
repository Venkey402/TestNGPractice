package tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseClass {
	public Logger logger ;
	BaseClass()
	{
		logger = Logger.getLogger("TestNG Practice");
		PropertyConfigurator.configure("log4j.properties");
	}

}
