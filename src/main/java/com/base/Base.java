package com.base;
import org.openqa.selenium.WebDriver;

import com.config.ConfigurationReader;
import com.config.PropertyFileReader;
import com.framework.Browser;
import com.util.PathHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Base {
	public static Logger log=Logger.getLogger(Base.class);
	
	public static WebDriver driver;
	public static ConfigurationReader reader;
	
}
	
	
	
	



