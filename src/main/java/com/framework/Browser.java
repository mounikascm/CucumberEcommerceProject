package com.framework;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
		public static Logger log = Logger.getLogger(Browser.class);

		public static WebDriver startBrowser() {
			String browser = Base.reader.getBrowser().toLowerCase();
			log.info("Selected Browser is: "+browser);
			switch (browser) {

			case "FireFox":				
			WebDriverManager.firefoxdriver().setup();
			Base.driver = new FirefoxDriver();
			log.info("Firefox Browser is Started" + Base.driver.hashCode());
			return Base.driver;


			case "edge":
				WebDriverManager.edgedriver().setup();
				Base.driver = new EdgeDriver();
				log.info("Edge Browser is Started" + Base.driver.hashCode());
				return Base.driver;

			default:	
					WebDriverManager.chromedriver().setup();
					Base.driver = new ChromeDriver();
					log.info("Chrome Browser is Started" + Base.driver.hashCode());
					return Base.driver;

			

			
			}

		}

		public static void maximize() {
			Base.driver.manage().window().maximize();
		}
		
		public static void openapplicationUrl() {
			Base.driver.get(Base.reader.getUrl());

		}

		public static byte[] takeScreenshot() {
			try {
				return ((TakesScreenshot)Base.driver).getScreenshotAs(OutputType.BYTES);
			}
			catch(Exception e){
				log.info("Exception has Occured while taking screenshot");
				return null;
			}

			

		}
	}


