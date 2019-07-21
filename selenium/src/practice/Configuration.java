package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration {

	static Logger log = Logger.getLogger(Configuration.class);
	 static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("F:\\Automation\\selenium\\config.properties");
		log.info("Properties file is loading....");
		pro.load(fis);
		
		String url = pro.getProperty("URL");
		log.info("get URL link from properties file..");
		System.out.println(url);
		
		String browsername = pro.getProperty("browser");
		log.info("get browser name from properties file..");
		System.out.println(browsername);
		
		if(browsername.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\think\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			log.info("browser is launch");
			
		}
		else{
			log.info("browser is not found");
			System.out.println("browser is null");
		}
		log.info("launch URL");
		driver.get(url);
		
		driver.quit();
		log.info("close the browser");
	}
	
}
