package StepDefinition;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

//import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
//import PageObject.SearchCustomerPage;
import Utitlities.ReadConfig;

import org.apache.logging.log4j.*;
import org.openqa.selenium.chrome.ChromeOptions;

/*Parent Class*/
public class BaseClass {

	//public static ChromeOptions options;

	public static  WebDriver driver;
	public LoginPage loginPg;
	//public SearchCustomerPage SearchCustPg;
	//public AddNewCustomerPage addNewCustPg;
	public static Logger log;
	public ReadConfig readConfig;
	//generate unique email id
	public String generateEmailId()
	{
		return(RandomStringUtils.randomAlphabetic(5));
	}
	
}
