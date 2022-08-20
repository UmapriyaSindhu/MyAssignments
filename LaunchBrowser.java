package week2.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser

{
   public static void main(String[] args)
   
   {
	   
//Connect with the browser driver(exe file)
	 WebDriverManager.chromedriver().setup(); //check for version and download
	/* String property=  System.getProperty("webdriver.chrome.driver");
	 * System.out.println(property);
	 */
	   
	   
	      //To launch the browser
	     //ChromeDriver driver=new ChromeDriver();
	   
	   
	     //to load url
	     //driver.get("http://leaftaps.com/opentaps/control/main");
  
   
  // Step2 :to launch the browser
   
   	   ChromeDriver driver=new ChromeDriver();
   	   
  //Step 3:Load the URL
   	   
   	   driver.get("http://leaftaps.com/opentaps/control/main");
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   }
}


