package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LeafTaps 

{

		   public static void main(String[] args) throws InterruptedException
		   
		   {
			   
		 //Connect with the browser driver(exe file)
		 WebDriverManager.chromedriver().setup(); //check for version and download
		  
	     // Step2 :to launch the browser
		   
		   	   ChromeDriver driver=new ChromeDriver();
		   	   
	     //Step 3:Load the URL
		   	driver.manage().window().maximize();
		   //	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		   	   
		   	driver.get("http://leaftaps.com/opentaps/control/main");
		   	
		   	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		   	driver.findElement(By.id("password")).sendKeys("crmsfa");
		   	driver.findElement(By.className("decorativeSubmit")).click();
		   	driver.findElement(By.linkText("CRM/SFA")).click();
		   	driver.findElement(By.linkText("Leads")).click();
            String title= driver.getTitle();
            System.out.println(title);
		   	//To close the browser
            
		   	Thread.sleep(2000);
		   	driver.close();
           
           }
	}
