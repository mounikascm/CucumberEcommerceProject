package com.config;

public interface ConfigurationReader {
	public String getUrl();
	public String getBrowser();
	public int getPageLoadTimeOut();
    public String getUserName();
    public String getPassword();
    public String getProduct();
    
}
