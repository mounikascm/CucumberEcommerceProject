package com.stefdefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.base.Base;
import com.config.ConfigurationReader;
import com.config.PropertyFileReader;
import com.framework.Browser;
import com.util.PathHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	public static Logger log=Logger.getLogger(Base.class);

	@Before
	public void setUp(Scenario scenario){
		log.info("Scenario Started: "+scenario.getName());
		PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
		Base.reader=new PropertyFileReader();
		Browser.startBrowser();
		Browser.maximize();
	}
	
	@After
	public void closeBrowser(Scenario scenario){
		if(scenario.isFailed()){
			scenario.attach(Browser.takeScreenshot(), "image", "image/png" );
		
		}
		log.info("Scenario Completed: "+scenario.getName());
		log.info("Scenario Status is: "+scenario.getStatus());
		Base.driver.quit();
		}
	}

